package Day1_1_Assignment;
import java.util.Scanner;

//Asignmnet on First and Last Number

public class FirstLastNumber {

	public static void main(String[] args) {
		  System.out.print("Enter a number: ");
		 Scanner scanner = new Scanner(System.in);
	        int number = scanner.nextInt();
	        
	        int firstDigit = 0;
	        int lastDigit = number % 10;
	        
	        while (number != 0) {
	            firstDigit = number;
	            number /= 10;
	        }
	        
	        System.out.println("First digit: " + firstDigit);
	        System.out.println("Last digit: " + lastDigit);

	}

}
