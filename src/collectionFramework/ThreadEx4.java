package collectionFramework;

class ThreadOne extends Thread
{
   synchronized public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread one is running");
            Thread.yield();
        }
    }
}
class ThreadTwo extends Thread
{
   synchronized public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread two is running");
        }
    }
}
 
class ThreadEx4
{
    public static void main(String args[])
    {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        threadOne.start();
        threadTwo.start();
    }
}
