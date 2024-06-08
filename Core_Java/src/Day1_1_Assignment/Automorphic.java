package Day1_1_Assignment;
import java.util.Scanner;
import java.math.*;

//Asignmnet on Automorphic Number or not

public class Automorphic {
	
	public static void main(String args[])
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 0,rem,c=0;
		int sqr = num * num;
		int temp = num;
		while(temp > 0)
		{
			c++;
			temp = temp/10;
		}
		int last  = (int)(sqr%(Math.pow(10,c)));
		
		if(num == last)
		{
			System.out.println("It is automorphic number");
		}else
		{
			System.out.println("It is not automorphic number");
		}
		
	}

}
