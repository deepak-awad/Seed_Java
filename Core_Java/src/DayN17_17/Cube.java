package DayN17_17;

/*** Lambda expression cube example ***/

public class Cube {
	
	
	
	public static void main(String args[])
	{
		
		Cubinterface c = (n )-> System.out.println("Cube of number is: "+(n*n*n));
		c.cube(15);
		
		
	}

}
