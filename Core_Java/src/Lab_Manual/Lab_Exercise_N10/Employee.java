package Lab_Manual.Lab_Exercise_N10;

/*** Problem Statement 1: An employee has a date of joining. so we define an object of Date class as a contained object in the Employee class. 
 * make an appropriate changes in constructors and method the display the employee details. ++Reference DateofJoining class++ ***/

public class Employee {
	
	private int empid;
	private float salary;
	DateofJoining d1;
	 
	 public Employee() {
		 empid=0;
		 salary = 0f;
		 d1 = new DateofJoining(10,02,2002);
	 }
	 public Employee(int id , float salary,DateofJoining d1)
	 {
		 this.empid =id;
		 this.salary =salary;
		 this.d1 =d1;
	 }
	 public String toString()
	{
		return "employee id: "+empid+"\nSalary is: "+salary+"\nDate of Joining :"+d1;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(12,15000f,new DateofJoining(10,03,2005));
		System.out.println(e1.toString());
	}
}
