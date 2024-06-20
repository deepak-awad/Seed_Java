package Lab_Manual.Lab_Exercise_N18;
import java.util.Scanner;

/*** Problem Statement 2: Write a simple 'calculator' class which performs basic operations such as "Add","Substract","Multiply"
 *   ,"Divide". User should enter two  numbers and select operations. Give result according to that.   ***/

public class Calculator {

	public static void main(String[] args) {
		
		String choice = null;
		int n1, n2, n3;
		do
		{
			System.out.println("Enter number n1:");
			Scanner sc = new Scanner(System.in);
			n1 = sc.nextInt();
			
			System.out.println("Enter number n2:");
			Scanner sc1 = new Scanner(System.in);
			n2 = sc1.nextInt();
			
			System.out.println("1) Add "
					+ "\n2) Substract"
					+ "\n3) Multiply"
					+ "\n4) Divide");
			Scanner sc2 = new Scanner(System.in);
			choice = sc2.next();
			
			switch(choice)
			{
			case "Add":
				n3 = n1+ n2;
				System.out.println(n3);
				break;
				

			case "Substract":
				n3 = n1- n2;
				System.out.println(n3);
				break;
				

			case "Multiply":
				n3 = n1* n2;
				System.out.println(n3);
				break;

			case "Divide":
				n3 = n1/ n2;
				System.out.println(n3);
				break;
				
				default:
					System.out.println("Invalid choice..");
			}
			
		}while(choice != null);

	}

}
