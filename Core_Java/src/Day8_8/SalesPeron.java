package Day8_8;

/*** Sharpen your pencil with example wage Employee, salesperson, Employee and Inheritance Demo main method   ***/


public class SalesPeron extends WageEmployee {
	int sales;
	int commission;
	double total;
	
	public SalesPeron()
	{
		sales =0;
		commission =0;
	}
	public SalesPeron(int id, String name, float salary,int hour, float rate, int sales, int comm)
	{
		super(id, name, salary, hour, rate);
		this.sales = sales;
		this.commission =comm;
	}
	public double calculateSalary()
	{
		int sl = sales * commission;
		return total = salary + sl;
	}
	public String toString()
	{
		return super.toString()+"\nTotal Salary:"+total;
	}

}
