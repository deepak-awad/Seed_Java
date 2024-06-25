package ResturantBillingSystem;

/*** Customer data details ***/

public class Customer {
	
	protected int id;
	protected String name;
	protected int number;
	protected static int count;
	
	static 
	{
		count++;
	}
	public Customer()
	{
		id = count++;
		name = null;
		number = 0;	
	}
	public Customer(String name, int number)
	{
		id = count++;
		this.name = name;
		this.number = number;
	}
	public void display()
	{
		System.out.println("Customer id: "+id);
		System.out.println("Customer name: "+name);
		System.out.println("Customer number: "+number);
	}
}
