package DayN18_18;
class ChildThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Child Thread Running");
        }
    }
}
 
class MainThread1
{
    public static void main(String args[])
    {
        ChildThread childThread = new ChildThread();
        childThread.start();
        for(int i=1;i<=10;i++)
        {
            System.out.println("Main Thread Running");
            Thread.yield();
        }
    }
}