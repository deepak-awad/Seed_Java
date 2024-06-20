package Lab_Manual.Lab_Exercise_N18;

/*** Problem Statement 1: Write a class StringDemo to reverse String using the StringBuffer. ***/

public class StringDemo {
	
	public static void main(String args[])
	{
		StringBuffer str1 = new StringBuffer("Hello World !!");
		System.out.println("The Before reverse String is: "+str1);
		System.out.println("The After reverse String is: "+str1.reverse());
		
	}

}
