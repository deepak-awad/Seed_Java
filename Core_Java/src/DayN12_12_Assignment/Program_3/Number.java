package DayN12_12_Assignment.Program_3;
import java.util.Scanner;
/***  Write a Java Program to accept a number and display
Factorial of number. if number is -ve then display
NegativeNumberExcpetion  ***/

public class Number {
	
	public static void main(String args[])
	{
		System.out.println("Enetr a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		try
		{
			if(number > 1)
			{
				int fact=1 ;
				for(int i =1;i <= number; i++)
				{
					fact *= i;
				}
				System.out.println("The factorial of number is: "+fact);
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
