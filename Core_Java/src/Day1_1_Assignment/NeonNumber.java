package Day1_1_Assignment;
import java.util.Scanner;

//Asignmnet on Neon Number or not

public class NeonNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem,mul=1, sum =0;
		int number = num;
		
		mul = num * num;
		System.out.println("Multilication is:"+mul);
		
		while(mul >0)
		{
			rem = mul % 10;
			sum = sum+rem;
			mul = mul /10;
		}
		System.out.println("Addition is:"+sum);
		
		if(number == sum)
		{
			System.out.println("It is Neon Number");
		}else
		{
			System.out.println("It is not Neon Number");
		}
		
	}

}
