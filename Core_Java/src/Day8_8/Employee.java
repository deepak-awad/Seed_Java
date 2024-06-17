package Day8_8;

/*** Sharpen your pencil with example wage Employee, salesperson, Employee and Inheritance Demo main method   ***/


public class Employee {
	
	int id;
	String name;
	Float salary;
	
	public Employee()
	{
		id=0;
		name=null;
		salary =0.0f;	
	}
	public Employee(int id, String name, float salary)
	{
		this.id =id;
		this.name= name;
		this.salary = salary;
	}
	public String toString()
	{
		return "id: "+id+"\nname: "+name+"\nsalary: "+salary;
	}
	public double calculateSalary()
	{
		return 0;
	}

}
