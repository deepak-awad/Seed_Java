package EmployalibilityLab.Problem9;


public class Nurse extends Person {
	
	int hrsWorked;
	String Shift;
	Double hrRate;
	int payment;
	
	public Nurse(String name, int hrs, String shift, double rate)
	{
		super(name);
		this.hrsWorked = hrs;
		this.Shift = shift;
		this.hrRate = rate;
	}
	
	public int calculatePayment()
	{
		payment = (int) (hrsWorked * hrRate);
		return payment;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("The name is:"+name);
		System.out.println("\nThe hours worked is:"+hrsWorked);
		System.out.println("\nThe Shift is:"+Shift);	
		System.out.println("The Hours Rate is:"+hrRate);
		System.out.println("The payment is:"+payment);
		
	}

}
