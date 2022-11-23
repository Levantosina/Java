import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class test {

    private int counter;

    public static void main(String[] args) throws InterruptedException {

        new Worker().main();
    }
}

class Worker {


    Random random = new Random();

    Object lock1=new Object();
    Object lock2=new Object();
    private List<Integer> list = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public  void addTolist1()  {


        synchronized (lock1) {
            try {
            Thread.sleep(1);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
            }
            list.add(random.nextInt(100));
        }
}
    public  void AddTolist2(){

        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt(100));

        }
    }

    public void work(){
        for (int i = 0; i <1000 ; i++) {
            addTolist1();
            AddTolist2();
        }
    }
    public void main() throws InterruptedException {

        long befor=System.currentTimeMillis();

       Thread thread =new Thread(new Runnable() {
           @Override
           public void run() {
               work();
           }
       });
       Thread thread1=new Thread(new Runnable() {
           @Override
           public void run() {
               work();
           }
       });

       thread.start();
       thread1.start();
       thread.join();
       thread1.join();

        long after=System.currentTimeMillis();
        System.out.println("Progmamm took "+ (after-befor));


        System.out.println("List1 "+list.size());
        System.out.println("List2 "+list2.size());
    }
}












//        public  void increment(){
//            synchronized (this) {
//                counter++;
//            }
//
//        }
//        public void doWork() throws InterruptedException {
//            Thread thread = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    for (int i = 0; i < 10000; i++) {
//                        increment();
//                    }
//                }
//            });
//            Thread thread1 = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    for (int i = 0; i < 10000; i++) {
//                        increment();
//                    }
//                }
//
//            });
//            thread.start();
//            thread1.start();
//
//            thread.join();
//            thread1.join();
//
//            System.out.println(counter);
//        }
//
//    }

