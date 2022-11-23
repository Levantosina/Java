import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class countDownLatch {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch=new CountDownLatch(3);


        ExecutorService executorService= Executors.newFixedThreadPool(6);
        for (int i=0;i<6;i++){
            executorService.submit(new processor(i,countDownLatch));

        }
        executorService.shutdown();

        for (int i = 0; i <3 ; i++) {
            Thread.sleep(1000);
            countDownLatch.countDown();
        }


    }
}

class processor implements Runnable{
    private  CountDownLatch countDownLatch;
    private int id;
    public processor(int id,CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
        this.id=id;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread with id "+ id +" proceeded");
    }
}
