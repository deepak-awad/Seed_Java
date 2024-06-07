package Day1_1_Assignment;
import java.util.Scanner;

//Asignmnet on SpyNumber or not  

public class SpyNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int rem, sum=0, mul=1;
		
		while(num > 0)
		{
			rem = num %10;
			sum = sum + rem;
			mul = mul * rem;
			num = num / 10;
		}
		System.out.println("The addition is :"+sum);
		System.out.println("The multiplication is:"+mul);
		if(sum == mul)
		{
			System.out.println("The number is spy number");
		}else
		{
			System.out.println("The number is not spy number");
		}
		

	}

}
