public class multithreading {
    public static void main(String[] args) {
        RunnableDemo runnableDemo1=new RunnableDemo("Thread-1");
        runnableDemo1.Start();
        RunnableDemo runnableDemo2=new RunnableDemo("Thread-2");
        runnableDemo2.Start();
        RunnableDemo runnableDemo3=new RunnableDemo("Thread-3");
        runnableDemo3.Start();
    }

    

}

class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName=name;
        System.out.println("Creating "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Running "+threadName);

        try {
            for (int i=4;i>0;i--){
                System.out.println("Thread "+threadName+" ,"+i);
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Thread "+threadName+" interrupted");
        }
        System.out.println("Thread "+threadName+" existed ");
    }
    public  void Start(){
        System.out.println("Starting "+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}
