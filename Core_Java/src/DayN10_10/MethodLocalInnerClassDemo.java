package DayN10_10;

/*** Method Local Inner class ***/

class OutDemo
{
 public void display()
 {
	int n=10;  // local variable
	//Method Local Inner class  
    class InnerDemo
	{
	  int m;
	  public InnerDemo() 
	  {
	    m=20;
	  }
	  public void m1()
	  {
	    System.out.println("m:"+m);
	    System.out.println("n:"+n); // allowed to use final variable
	    // effective final variable jdk1.8
	  }	
	}//end class
    
    InnerDemo ob= new InnerDemo();
    ob.m1();
     
  }//end method
 
 }//end OutDemoclass
public class MethodLocalInnerClassDemo 
{
 public static void main(String[] args) 
 {
	 OutDemo obj= new OutDemo();
	 obj.display();
 }
}