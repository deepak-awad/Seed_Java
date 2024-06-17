package Day7_7_Assignment.Program_4;
import java.util.Scanner;

/***  Imagine a tollbooth at a bridge. Cars passing by the booth are
expected to pay a 50 Rs. toll. Mostly they do, but sometimes a car goes by
without paying. The tollbooth keeps track of the number of cars that have
gone by, and of the total amount of money collected. Model this tollbooth
with a class called tollBooth. The two data items are a type int to hold
the total number of cars, and a type double to hold the total amount of
money collected. A constructor initializes both of these to 0. A member
method called payingCar() increments the car total and adds 0.50 to the
cash total. Another method, called nopayCar(), increments the car total
but adds nothing to the cash total. Finally, a member
method called display() displays the two totals.
Make appropriate member method. ***/

public class Toolbooth {
	
	int no_of_cars;
	double money_collected;
	
	public Toolbooth()
	{
		no_of_cars =0;
		money_collected =0.0;
	}
	public void payingCars()
	{
		no_of_cars++;
		money_collected+=50;
	}
	public void nopayCar()
	{
		no_of_cars++;
	}
	public void display()
	{
		System.out.println("Total Cars:"+no_of_cars);
		System.out.println("Money Collectd:"+money_collected);
	}
	

	public static void main(String[] args) {
		
		Toolbooth t1 = new Toolbooth();
		
		System.out.println("Enter no of cars to pass:");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		for(int i=0;i<n1;i++)
		{
		t1.payingCars();
		t1.nopayCar();
		t1.display();
		}
		

	}

}
