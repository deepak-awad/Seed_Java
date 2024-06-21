package DayN12_12;
import java.util.Scanner;

/*** Example on Factorial Number Check number main  ***/

public class FactoricalMainApp
{
 public static void main(String[] args) 
 {
   Scanner sc= new Scanner(System.in);
   try
   {
   System.out.println("Enter the Number:");
   int n =sc.nextInt();
   if(n<0)
   {
	   throw new NegativeNumberException();
   }
   else
   {
	   int fact=1;
	   for(int i=1;i<=n;i++)
	    {
		   fact=fact*i;
	    }
      System.out.println("Factorial of Number:"+fact);
   }
   }
   catch (NegativeNumberException e) 
   {
	e.printStackTrace();
   }
	 

 }//end main
}//end class
