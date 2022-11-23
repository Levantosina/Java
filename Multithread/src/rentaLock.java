import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class rentaLock {

    public static void main(String[] args) throws InterruptedException {
        Task task=new Task();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                task.firstThird();
            }
        });
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                task.secondThird();
            }
        });
thread.start();
thread1.start();

thread.join();
thread1.join();

task.showCounter();
    }
}
class  Task {
    private int count;
    private Lock lock=new ReentrantLock();
    private void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public void firstThird() {
        lock.lock();
        increment();
        lock.unlock();
    }

    public void secondThird() {
        lock.lock();
        increment();
        lock.unlock();
    }

    public void showCounter() {
        System.out.println(count);
    }
}