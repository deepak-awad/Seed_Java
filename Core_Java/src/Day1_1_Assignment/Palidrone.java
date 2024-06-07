package Day1_1_Assignment;
import java.util.Scanner;

//Asignmnet on Palidrone or not

public class Palidrone {
	
	public static void main(String ars[])
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int oldnum=num;
		int rev=0,rem;
		
		while(num > 0)
		{
			rem = num%10;
			rev = rev * 10+rem;
			num = num/10;
		}
		if(oldnum == rev)
		{
		    System.out.println("The number is palidrone");
		}
		else
		{
			System.out.println("The number is not palidrone");
		}
	}

}
