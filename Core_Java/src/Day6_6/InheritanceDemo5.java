package Day6_6;

class Emp4
{
  public Emp4() 
  {	
	  this(10);
    System.out.println("Default Constructor...Parent");
  }	
  public Emp4(int n) 
  {
	System.out.println("Parameterized Constructor...Parent");
  }	
}
class Mgr extends Emp4
{
  public Mgr() 
  {
   System.out.println("Default Constructor...Child");
  }	
  public Mgr(int n) 
  {
	super(20);  
    System.out.println("Parameterized Constructor...Child");
  }	
}

public class InheritanceDemo5 {
	 public static void main(String[] args) 
	 {
	     Mgr ob = new Mgr();
	 }

}
