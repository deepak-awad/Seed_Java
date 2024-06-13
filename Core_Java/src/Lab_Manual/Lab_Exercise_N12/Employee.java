package Lab_Manual.Lab_Exercise_N12;

/*** construct hierarchy of employees. Inherit class Manager and MarketingExecutive from base class employee. 
 * Employee class    ***/

public class Employee {
	private int employee_id;
	private String employee_name; 
	protected double salary, hra, pf, pt, medical, net_salary, gross_salary;
	
	public Employee()
	{
		employee_id = 101;
		employee_name = "Deepak Awad";
		salary =50000;
		hra = (salary * 50) / 100 ;
		pf=(salary * 12) / 100;
		pt = 200;
		medical = 200;
		calculate();
	}
	public Employee(int id, String name, double sal, double medical)
	{
		this.employee_id = id;
		this.employee_name = name;
		this.salary = sal;
		this.hra = (this.salary * 50) / 100 ;
		this.pf = (this.salary * 12) / 100;
		pt = 200;
		this.medical = medical;
		calculate();
	}
	public void calculate()
	{
		gross_salary = salary + hra + medical;
		net_salary = gross_salary - (pt + pf);
	}
	public String toString() 
	{
		return "Employee id is: "+employee_id+"\nEmployee Name: "+employee_name+"\nSalary is: "+salary;
	}
}
