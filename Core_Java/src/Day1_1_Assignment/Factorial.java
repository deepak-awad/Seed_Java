package Day1_1_Assignment;
import java.util.Scanner;

//Assignment on factorial of number

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		
		for(int i =1;i<=num;i=i+1)
		{
			fact = fact *i ;
		}
		System.out.println("The factorial of number is:"+fact);

	}

}
