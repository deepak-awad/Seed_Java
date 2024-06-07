package Day1_1_Assignment;
import java.util.Scanner;

//Assignment on Reverse Number or not

public class ReverseNumber {
	
	public static void main(String args[])
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0,rem;
		
		while(num>0)
		{
			rem = num%10;
			rev = rev * 10+rem;
			num = num/10;
		}
		System.out.println("The reverse number is:"+rev);
	}

}
