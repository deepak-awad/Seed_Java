package Day5_5;
import java.util.Scanner;

/*** Enhanced loop or for each loop ***/

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of elemnts: ");
		Scanner sc = new Scanner(System.in);
		int arr =sc.nextInt();
		sc.close();
		
		int sum=0;
		int arr1[] = new int[arr];
		System.out.println("Enter elemnts: ");
		Scanner sc1 = new Scanner(System.in);
		sc1.close();
		
		for(int i =0;i<arr1.length;i++)
		{
			arr1[i]=sc1.nextInt();
			sum = sum + arr1[i];
		}
		System.out.println("Elements are: "+sum);

	}

}
