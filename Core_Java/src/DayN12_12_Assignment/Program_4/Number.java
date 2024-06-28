package DayN12_12_Assignment.Program_4;
import java.util.*;

/*** Write a Java Program to accept a number and display
Factorial of number. if number is -ve then display
NegativeNumberExcpetion ***/

public class Number {
	
	public static void main(String args[])
	{
		int number;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		try
		{
			if(number > 1)
			{
				System.out.println("The number is positive");
			}
			else
			{
				throw new NegativeNumberExcpetion();
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			sc.close();
		}
	}

}
