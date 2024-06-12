package Day4_4_HomeWork;

/*** Home Work Static Field and Static Method Employee Class ***/

public class Employee {
	
	static int count;
	int empid;
	private String name;
	public float salary;
	
	static
	{
		count=0;
	}
	public Employee(String name, float salary)
	{
		this.empid=++count;
		this.name = name;
		this.salary = salary;
	}
	public void display()
	{
		System.out.println("\nEmployee id:"+empid);
		System.out.println("\nEmployee name:"+name);
		System.out.println("\nSalary is:"+salary);
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("John Ceina",50000);
		e1.display();
		Employee e2 = new Employee("John Ceina",25000);
		e2.display();
		Employee e3 = new Employee("John Ceina",15000);
		e3.display();
		
	}

}
