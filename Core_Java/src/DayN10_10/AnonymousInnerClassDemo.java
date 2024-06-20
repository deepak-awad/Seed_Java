package DayN10_10;

/*** Anonymous Inner Class ***/

class OuterTest
{
    int n;
    
	Employee e= new Employee()
	{ // start
	    int incentive=1000;
	    @Override
		public void display() 
		{
		  super.display();
		  System.out.println("Employee Incentive:"+incentive);
		}
	};//end class
	
		
	I ob1= new I() 
	{//start
		@Override
		public void display() 
		{
	      System.out.println("display method called");  
	 	}
	};//end 
	
}//end class

public class AnonymousInnerClassDemo 
{
 public static void main(String[] args) 
 {
   OuterTest ob= new OuterTest();
   ob.e.display();
   
   ob.ob1.display();

 }
}