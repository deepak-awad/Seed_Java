package Day1_1_Assignment;
import java.util.Scanner;

//Asignmnet on Krishnamurthy Number or not

public class KrishnamurthyNumber {
	
	public static void main(String args[])
	{
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int p,rev,f,s=0;
		p=num;
		while(num > 0)
		{
			rev = num % 10;
			f =1;
			for(int i=rev;i>=1;i--)
			{
				f = f*i;
			}
			s=s+f;
			num = num / 10;
		}
		if(p == s)
		{
			System.out.println("It is krishmnurth number");
		}else
		{
			System.out.println("It is not krishmnurth number");
		}
		
	}

}
