package EmployalibilityLab.Problem7;

public class Doctor extends Person {
	
	double salary;
	String specializationtype;
	
	public Doctor(String name,double salary, String type)
	{
		super(name);
		this.salary = salary;
		this.specializationtype = type;
	}
	public void displpayDetails()
	{
		System.out.println("The name is:"+name);
		System.out.println("\nThe salay is:"+salary);
		System.out.println("The specializatin type is:"+specializationtype);
		
	}
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}

}
