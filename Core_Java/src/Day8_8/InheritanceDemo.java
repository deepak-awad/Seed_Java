package Day8_8;

/*** Sharpen your pencil with example wage Employee, salesperson, Employee and Inheritance Demo main method   ***/

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e= new WageEmployee(101, "Deepak", 15000, 2, 2);
		e.calculateSalary();
		System.out.println(e.toString());
		
		e = new SalesPeron(101, "Deepak", 15000,2, 2,150,15);
		e.calculateSalary();
		System.out.println(e.toString());
		}

}
