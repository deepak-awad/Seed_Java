package Day1_1_Assignment;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        long a, digit, sum_digit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer value : ");
        a = sc.nextLong();
        System.out.println();
        do {
            sum_digit = 0; // Reset sum_digit for each iteration
            while (a != 0) {
                digit = a % 10;
                sum_digit += digit; // Accumulate sum of digits
                a = a / 10;
            }
            a = sum_digit; // Update a with the sum of digits for the next iteration
        } while (a > 9);
        System.out.println("The sum of digits is: " + a);
    }
}
