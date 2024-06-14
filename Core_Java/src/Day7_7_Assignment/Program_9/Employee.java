package Day7_7_Assignment.Program_9;

/***   Construct a class Employee with following members using private access specifies:
                      i.     Employee Id                                            integer
                      ii.      Employee Name                                        string
                      iii.     Basic Salary                                         double
                      iv.     HRA                                                   double
                      v.     PF                                                     double
                     vi.     PT                                                     double
                     vii.      Net Salary                                           double
                     viii.     Gross Salary                                         double
                    Please use following expressions for calculations:
                    HRA = 50% of Basic Salary
                    PF = 12% of Basic Salary
                    PT = Rs. 200
a) Write two parameter constructor to initialize name and basic salary. Employee id should be automatically generated.
b) Write calculateSalary() method with no parameters. The method should not return any value. [Hint: return type will be void]
This method will use the expressions mentioned above for calculations.
c)  Write printDetails() method to print the details of an employee. ***/

public class Employee {
	
	private int Employee_id;
	private String Employee_Name;
	private double Basic_Salary;
	private double HRA;
	private double PF;
	private double PT;
	private double Net_Salary;
	private double Gross_Salary;
	public static int count;
	
	public Employee(String name, double Basic_Salary)
	{
		this.Employee_id = ++count;
		this.Employee_Name = name;
		this.Basic_Salary = Basic_Salary;
		this.PT = 200;
	}
	
	public void calculateSalary()
	{
		HRA = (Basic_Salary * 50)/100;
		PF =(Basic_Salary * 12) /100;
		Gross_Salary = Basic_Salary + HRA -PF;
		Net_Salary =  Gross_Salary - PT;
	}
	
	public void printDetails()
	{
		 System.out.println("Employee ID: " + Employee_id);
	        System.out.println("Employee Name: " + Employee_Name);
	        System.out.println("Basic Salary: " + Basic_Salary);
	        System.out.println("HRA: " + HRA);
	        System.out.println("PF: " + PF);
	        System.out.println("PT: " + PT);
	        System.out.println("Net Salary: " + Gross_Salary);
	        System.out.println("Gross Salary: " + Net_Salary);
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Deepak Awad",50000);
		e1.calculateSalary();
		e1.printDetails();
	}

}
