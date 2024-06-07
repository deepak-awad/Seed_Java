package Day1_1_Assignment;
import java.util.Scanner;
import java.math.*;

//Asignmnet on Armstrong or not

public class Armstrong {
	
	public static void main(String args[])
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
	
		int originalnumber,result=0,rem;
		originalnumber =num;
		
		while(num >0 )
		{
			rem = num % 10;
			result= (int) (result + Math.pow(rem, 3));
			num = num /10;
		}
		if(result == originalnumber )
		{
		    System.out.println("The number is ArmStrong");
		}
		else
		{
			System.out.println("The number is not Armstrong");
		}
	}

}
