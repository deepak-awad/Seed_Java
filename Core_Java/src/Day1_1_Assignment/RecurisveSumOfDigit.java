package Day1_1_Assignment;
import java.util.Scanner;

//Asignmnet on Recursive Sum of Digit

public class RecurisveSumOfDigit {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum =0,rem,new1=0;
		
		while(num > 0)
		{
			rem = num % 10;
		    sum = sum + rem;
		    num = num / 10;
		    
		    rem =sum %10;
			new1 = new1 +rem;
		}
		
		System.out.println("The recursive sum of digit is:"+new1);
	}

}
