package DayN18_18;
class EvenThread extends Thread
{
  @Override
  public void run() 
   {
    
   	if(Thread.currentThread().getName().equals("even"))
     {
    	for(int i=1;i<=100;i++)
    	   	{	
    		Thread.yield();
    	   	  if(i%2==0)	
      	 	  System.out.println("EvenThread:"+i);
    	}
   	  }// end if
   }
}
class OddThread extends Thread
{
  @Override
  public void run() 
   {
	if(Thread.currentThread().getName().equals("odd")) 
	{
	  for(int j=1;j<=100;j++)
       {
		  try {
			this.join(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         if(j%2!=0)	
    	  System.out.println("OddThread:"+j);
        }
      }//end for
   } // end thread 
} // end class
public class ThreadTest
{
 public static void main(String[] args) throws InterruptedException 
 {
	 Thread t1 = new EvenThread();
	 Thread t2 = new OddThread();
	 t1.setName("even");
	 t2.setName("odd");
     t1.setPriority(Thread.MAX_PRIORITY);
	 t2.setPriority(Thread.MIN_PRIORITY);
	 t1.start();
	 t2.start();
	 
	
 } // end main
}// end class
