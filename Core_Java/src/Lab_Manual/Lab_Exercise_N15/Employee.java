package Lab_Manual.Lab_Exercise_N15;

/*** Problem Statement 1: Define an interface Printable with a method display. Implement this interface in Employee, Shape and Date class.  ***/

public class Employee implements Printable {
	
	@Override
	public void print()
	{
		System.out.println("Employee dislay method");	
	}

}
