package Day1_1_Assignment;
import java.util.Scanner;

//Asignmnet on Perfect Number or not 

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum =0;
		int i=1;
		
		while(i <= num/2)
		{
			if(num % i ==0)
			{
				sum = sum + i;
			}
			i++;
		}
		if(temp == sum)
		{
			System.out.println("It is perfect Number");
		}else
		{
			System.out.println("It is not perfect Number");
		}
		

	}

}
