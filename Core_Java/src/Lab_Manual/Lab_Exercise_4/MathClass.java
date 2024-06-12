package Lab_Manual.Lab_Exercise_4;

/*** Problem statement 1: write a method in the Math Class that accepts the variable number of integers.
  The method should find the sum of all integers and display and result. 
  Write a client program to call the method with variable numbers of integers  ***/

public class MathClass {
	
	public void add(int ...a)
	{
		int sum =0;
		for(int i : a)
		{
			sum += i;
		}
		System.out.println("The addition is:"+sum);
	}

	public static void main(String[] args) {
		
		MathClass m1 = new MathClass();
		m1.add(10,20,30,40);
		

	}

}
