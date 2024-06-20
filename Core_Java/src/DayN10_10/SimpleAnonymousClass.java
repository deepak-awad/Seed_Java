package DayN10_10;

/*** Simple Anonymous Example with Employee ***/

public class SimpleAnonymousClass {
	
	Display d = new Display()
	{
		@Override
		public void display() {
			
			System.out.println("interface to be override");
			
		}
	};
	
	public static void main(String args[])
	{
		SimpleAnonymousClass s = new SimpleAnonymousClass();
		s.d.display();
	}

}
