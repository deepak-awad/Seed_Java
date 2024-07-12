package EmployalibilityLab.Problem8;


public class Nurse extends Person {
	
	int hrsWorked;
	String Shift;
	Double hrRate;
	
	public Nurse(String name, int hrs, String shift, double rate)
	{
		super(name);
		this.hrRate = (double) hrs;
		this.Shift = shift;
		this.hrRate = rate;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("The name is:"+name);
		System.out.println("\nThe hours worked is:"+hrsWorked);
		System.out.println("\nThe Shift is:"+Shift);	
		System.out.println("The Hours Rate is:"+hrRate);
		
	}

}
