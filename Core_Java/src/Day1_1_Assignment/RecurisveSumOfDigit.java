package Day1_1_Assignment;
import java.util.Scanner;

//Asignmnet on Recursive Sum of Digit

public class RecurisveSumOfDigit {

	public static void main(String[] args) {
		
		long a, digit,sum_digit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer value : ");
		a= sc.nextLong();
		System.out.println();
	 do{
		 sum_digit = 0; 
         while (a != 0) {
             digit = a % 10;
             sum_digit = sum_digit+digit;
             a = a / 10;		
		}
		a=sum_digit;
		}while(a>9);
		System.out.println(a);

	}

}
