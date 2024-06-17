package Day8_8;

/*** Sharpen your pencil with example wage Employee, salesperson, Employee and Inheritance Demo main method   ***/


public class WageEmployee extends Employee 
{
	int hours;
	float rate;
	double total;
	
	public WageEmployee()
	{
		hours=0;
		rate=0;
	}
	public WageEmployee(int id, String name, float salary,int hour, float rate)
	{
		super(id, name, salary);
		this.hours = hour;
		this.rate = rate;
		
	}
	public double calculateSalary()
	{
		return total = salary *(rate * hours);
	}
	public String toString()
	{
		return super.toString()+"\nTotal Salary:"+total;
	}

	
}
