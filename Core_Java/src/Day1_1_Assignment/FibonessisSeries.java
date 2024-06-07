package Day1_1_Assignment;
import java.util.Scanner;

//Asignmnet on Fibonessis Series

public class FibonessisSeries {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int n1=0,n2=1,n3;
		System.out.println("The fibonessis Series are:\n"+n1+"\n"+n2);
		
		for(int i =2;i<=num;i=i+1)
		{
			n3 = n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
