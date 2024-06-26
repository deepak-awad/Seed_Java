package Lab_Manual.Lab_Exercise_N21;
import java.util.Scanner;

/*** Problem Statement 2: Create a class DivisionDemo. If the user enters the second number zero throws an integer.
 * Hint: Airthmetic Exception
 * Note: use throws   ***/

public class DivisionDemo {
	
	public static void main(String[] args) {
		
		int num, deno,result;
		Scanner sc =new Scanner(System.in);
		
		try 
		{
			System.out.println("Enter numerator:");
	        num = sc.nextInt();
	        
			System.out.println("Enter Denomenator:");
	        deno = sc.nextInt();
	        
	        result = num / deno;
	        System.out.println(result);
	    
	    
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
	}

}
