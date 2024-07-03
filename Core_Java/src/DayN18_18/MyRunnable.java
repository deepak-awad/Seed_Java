package DayN18_18;

public class MyRunnable implements Runnable 
{

	@Override
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"\t" + Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) 
	{
	
		Runnable r1 = new MyRunnable();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.setName("Ping");
		t2.setName("Pong");
		
		t1.start();
		t2.start();
	}

}
