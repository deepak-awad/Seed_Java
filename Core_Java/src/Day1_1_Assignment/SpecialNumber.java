package Day1_1_Assignment;
import java.util.Scanner;

//Asignmnet on Special Number or not

public class SpecialNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int originalnumber;
		originalnumber =num;
		int rem,sum=0,mul=1, add = 0;
		while(num > 0)
		{
			rem = num % 10;
			sum = sum + rem;
			mul = mul * rem;
			num = num / 10;	
		}
		add = sum + mul;
		System.out.println("The addition is :"+sum);
		System.out.println("The multiplication is:"+mul);
		System.out.println("The addition of sum and mul :"+add);
		
		if(originalnumber == add)
		{
			System.out.println("It is Special Number");
		}
		else
		{
			System.out.println("It is not Special Number");
		}

	}

}
