package DayN18_18;
class MyThread implements Runnable
{
    @Override
    public void run() 
    {
        Thread thread = Thread.currentThread();
        for(int i = 1; i <= 3; i++)
            System.out.println(thread.getName() + " running : "+ i);
        
        System.out.println("Thread ended: "+thread.getName());    
    }
}
public class MainThread2 
{
   public static void main(String[] args) throws InterruptedException 
   {
      Thread thread1 = new Thread(new MyThread(), "thread1");
      Thread thread2 = new Thread(new MyThread(), "thread2");
      Thread thread3 = new Thread(new MyThread(), "thread3");
      // Start first thread immediately
      thread1.start();
      // Start second thread(thread2) after complete execution of first thread(thread1) 
      thread1.join();
      thread2.start();
      // Start second thread(thread2) after complete execution of first thread(thread1) 
      thread2.join();
      thread3.start();
   }
}


/*
 * In the above program, we can see all three threads are executing in a sequence. 
 * Here we are using the join() method that pauses the execution of the current thread 
 * and focuses on the joined thread. 
*/