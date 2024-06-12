package Day4_4_HomeWork;

/*** Home Work Static Field and Static Method Customer Class and no of customers ***/

public class Customer {
	
	public int empid;
	private String name;
	
	static int count;
	
	static
	{
		count=0;
		System.out.println("Before number of employees are:"+count);
	}
	public Customer(String name)
	{
		this.empid = ++count;
		this.name = name;
	}
	public void display()
	{
		System.out.println("After number of employees are:"+empid);
	}
	

	public static void main(String[] args) {
		
		Customer c1 = new Customer("Deepak Awad");
		Customer c2 = new Customer("Drashan Deore");
		Customer c3 = new Customer("Tessting one");
		c3.display();

	}

}
