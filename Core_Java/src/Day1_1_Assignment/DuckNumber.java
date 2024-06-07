package Day1_1_Assignment;
import java.util.Scanner;

//Asignmnet on Duck Number or not

public class DuckNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem,sum =0;
		boolean flag=false;
		while(num > 0)
		{
			rem = num %10;
			sum =rem;
			num = num /10;
			
			if(sum == 0) 
			{
			flag = true;
			break;
			}
		}
		
		if(flag)
		{
			System.out.println("The is Duck Number");
		}else
		{
			System.out.println("The number is not Duck Number");
		}
	

	}

}
