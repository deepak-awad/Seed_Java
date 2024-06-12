package Lab_Manual.Lab_Exercise_7;

/*** Problem statement 1: Implement toString() method of Employee class to represent the string representation of employee object.
 *  The method should return the employee_id, employee name and gross salary ***/

public class Employee {

	private int employee_id;
	private String name;
	public float salary;
	
	public Employee()
	{
		employee_id=0;
		name=null;
		salary = 0;
	}
	public Employee(int n, String name, float f)
	{
		this.employee_id =n;
		this.name = name;
		this.salary = f;
	}
	public String toString()
	{
		return "employee id is: "+employee_id+"\nName is: "+name+"\nSalary is: "+salary;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Testing one",25000f);
		e1.toString();
		System.out.print(e1);

	}

}
