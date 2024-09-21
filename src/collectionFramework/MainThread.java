package collectionFramework;

public class MainThread 
{
   public static void main(String[] args) throws InterruptedException 
   {
      Thread thread1 = new Thread(new MyThread(), "thread1");
      Thread thread2 = new Thread(new MyThread(), "thread2");
      Thread thread3 = new Thread(new MyThread(), "thread3");
         
      thread1.start();
      thread1.join();
      thread2.start();
      thread2.join();
      thread3.start();
      thread3.join();
   }
}
 
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