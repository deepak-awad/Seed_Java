package Day1_1_Assignment;
import java.util.Scanner;

//Assignment on Sum of Digit

public class SumOfDigit {

	public static void main(String[] args) 
	{
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int sum=0,rem;
		
		while(num !=0)
		{
			rem = num % 10;
			sum=sum + rem;
			num =num / 10;
		}
		System.out.println("The sum of digit is:"+sum);
	}

}
