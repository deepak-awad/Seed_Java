package DayN10_10;

/*** Employee Class  ***/

public class Employee
{
  int eid;
  String ename;
  int esal;
  public Employee() 
  {
      eid=101;
      ename="amit";
      esal=12000;
  }
  public void display()
  {
	System.out.println("Employee Id:"+eid);
	System.out.println("Employee Name:"+ename);
	System.out.println("Employee Salary:"+esal);
  }
}
