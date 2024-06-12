package Lab_Manual.Lab_Exercise_6;

/*** Problem statement 3: Display the total number of employees using a static method, totalEmployees(). and Modify the employees class to implement auto generation of employee_id   ***/

public class Employee {
	
	static int employee_id;
	private String name;
	private float salary;
	static int count;
	
	static
	{
		count =0;
	}
	public Employee(String name, float salary)
	{
		this.employee_id=++count;
		this.name = name;
		this.salary = salary;
	}
	public static void totalEmployees()
	{
		System.out.println("The total number of employees are : "+employee_id);
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Testing one",25000);
		Employee e2 = new Employee("John Ceina",15000);
		Employee e3 = new Employee("New One",35000);
		e3.totalEmployees();

	}

}
