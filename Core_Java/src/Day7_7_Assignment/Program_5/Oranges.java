package Day7_7_Assignment.Program_5;
import java.util.*;

/***  Four workers were responsible to pluck oranges. The owner of the orange farm will be given 40% of the oranges. The workers share equally the balance of the oranges.
 *  The balance of oranges after divided will be used to make juice. 
 * You are also required to calculate and print amount of oranges that were received by the owner, each of the workers and balance of oranges to make juice. Write a program.
Sample output:
Enter number of oranges plucked : 100
Total oranges for the owner is 40
Total oranges for each worker is 15
Balance of oranges to make juice is 0
***********another output sample**************
Enter number of oranges plucked : 125
Total oranges for the owner is 50 
Total oranges for each worker is 18 
Balance of oranges to make juice is 3
Answer:
  int numOranges = 0;
  s.o.pln("Enter number of oranges plucked:");
  numOranges=sc.nextInt();
  s.o.pln("Total oranges for the owner is "+((numOranges * 4) / 10);
  s.o.pln("Total oranges for each worker is  "+(numOranges - (numOranges * 4) / 10) / 4 );
  s.o.pln("Balance of oranges to make juice is  "+( numOranges - (numOranges * 4) / 10 - ((numOranges - (numOranges * 4) / 10) / 4) * 4 )); ***/


/**** display using in class and object
public class Oranges {
	public int numOranges;
	
	public Oranges(int num)
	{
		this.numOranges = num;
	}
	public void display()
	{
		System.out.println("Total oranges for the owner is "+((numOranges * 4) / 10));
		System.out.println("Total oranges for each worker is  "+(numOranges - (numOranges * 4) / 10) / 4 );
		System.out.println("Balance of oranges to make juice is  "+( numOranges - (numOranges * 4) / 10 - ((numOranges - (numOranges * 4) / 10) / 4) * 4 ));
	}
	

	public static void main(String[] args) {
		
		System.out.println("Enter number of oranges plucked:");
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		sc.close();
		
		Oranges n1 = new Oranges(num);
		n1.display();
		
	}
}

****/

/*** Using in Main Method   ***/

public class Oranges {

	public static void main(String[] args) {
		
		System.out.println("Enter number of oranges plucked:");
		Scanner sc = new Scanner(System.in);
		int numOranges =  sc.nextInt();
		sc.close();
		
		System.out.println("Total oranges for the owner is "+((numOranges * 4) / 10));
		System.out.println("Total oranges for each worker is  "+(numOranges - (numOranges * 4) / 10) / 4 );
		System.out.println("Balance of oranges to make juice is  "+( numOranges - (numOranges * 4) / 10 - ((numOranges - (numOranges * 4) / 10) / 4) * 4 ));
		
	}
}





