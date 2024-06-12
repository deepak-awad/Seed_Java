package Day4_4;
import java.util.Scanner;

/*** Addition of array or Sum of array ***/

public class ArrayAddition {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    int num[]=new int[5];  // array declaration
	    int sum=0;
	    System.out.println("Enter the five integers:");
	    for(int i=0;i<num.length;i++)
	    {
	 	  num[i]=sc.nextInt();
	 	  sum=sum+num[i];
	    }
	    System.out.println("Sum of array elemnmets:"+sum);
	}

}
