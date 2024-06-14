package Day7_7_HomeWork;

/*** Home Work Polymorphism concept WageEmployees Sales Person extend Employee class ***/

public class WageEmployee extends Employee {
	
	int hours;
	float rate;
	double total;
	
	public WageEmployee()
	{
		super();
		hours =0;
		rate =0;
	}
	public WageEmployee(String name, float salary,int hours, float rate)
	{
		super(name, salary);
		this.hours =hours;
		this.rate =rate;
	}
	public double calculateSalary()
	{
		 return total = (double) (salary * rate);
	}

}
