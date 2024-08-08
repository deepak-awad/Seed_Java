package DayN17_17;
import java.lang.Thread;



public class StreamApiExample {
	
	public static void main(String args[]) throws ClassNotFoundException
	{
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.setName("Hello");
		t2.setName("new");
		t1.start();
		t2.start();
	}

}

