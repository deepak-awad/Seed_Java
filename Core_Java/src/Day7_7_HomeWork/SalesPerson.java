package Day7_7_HomeWork;

/*** Home Work Polymorphism concept Inheritance Sales Person extend Employee class ***/

public class SalesPerson extends WageEmployee {
	
	int sales;
	float comm;
	double total;
	
	public SalesPerson()
	{
		sales = 0;
		comm = 0;
	}
	public SalesPerson(String name, float salary,int sal,int hours,int rate, int sales, float comm)
	{
		super(name, salary, hours, rate);
		this.sales = sales;
		this.comm = comm;
		
	}
	public double calculateSalary()
	{
		return total = (double) (salary * comm);
	}

}
