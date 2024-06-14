package Day7_7_HomeWork;

/*** Home Work Polymorphism concept Employee Main class ***/

public class Employee {
	
	String name;
	float salary;
	
	public Employee()
	{
		name =null;
		salary = 0;
	}
	public Employee(String name, float salary)
	{
		this.name  = name;
		this.salary = salary;
	}
	public String toString()
	{
		return "Employee Name : "+name+"\nSalary is:"+salary;
	}
	

}
