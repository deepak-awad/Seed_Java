package DayN10_10;

/*** Example on simpleInner class Main ***/

class Oldouter
{
	static int n =10;
	public void m1()
	{
		System.out.println("m1 is called");
	}
	public void display()
	{
		System.out.println("Outer display is called");
	}
	class Inner
	{
		public void m2()
		{
			System.out.println("m2 is called");	
			System.out.println(n);
		}
		public void display()
		{
			System.out.println("Inner display is called");
		}
	}
}

public class SimpleInnerMain {

	public static void main(String[] args) {
		
		Oldouter o = new Oldouter();
		o.m1();
		o.display();
		
		Oldouter.Inner i = o.new Inner();
		i.m2();
		i.display();
 	}

}
