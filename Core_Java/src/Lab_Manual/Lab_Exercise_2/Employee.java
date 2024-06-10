package Lab_Manual.Lab_Exercise_2;

/*** Problem statement 3: Consider that payroll software needs to be developed for computerization of operations of an ABC oraganization.  ***/

public class Employee {
	
	private int employee_id;
	private String employee_name; 
	private double salary, hra, pf, pt, medical, net_salary, gross_salary;
	
	public Employee()
	{
		employee_id = 101;
		employee_name = "Deepak Awad";
		salary =50000;
		hra = (salary * 50) / 100 ;
		pf=(salary * 12) / 100;
		pt = 200;
		medical = 200;
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
	}
	public void calculate()
	{
		gross_salary = salary + hra + medical;
		net_salary = gross_salary - (pt + pf);
		
	}
	public void display()
	{
		System.out.println("Employee_id: "+employee_id+"\nEmployee Name is: "+employee_name+"\nBasic saalary is:"+salary+"\nGross salary is:"+gross_salary+"\nNet Salary is:"+net_salary);
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.calculate();
		e1.display();
		Employee e2 = new Employee(102,"John  Ceina",50000,200);
		e2.calculate();
		e2.display();

	}

}
