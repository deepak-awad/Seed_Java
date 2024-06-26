package Lab_Manual.Lab_Exercise_N21;

import java.util.Scanner;

/*** Problem Statement 3: Use same 'DivisionDemo' class i.e Refer(Chapter -8, Lab ex-1 Problem stmt-1.
 *  If user enters second number as zero then handle that exception * 
 *  Note: use multicatch feature Java7  ***/

public class DivisionDemo1 {

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
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
	}
}
