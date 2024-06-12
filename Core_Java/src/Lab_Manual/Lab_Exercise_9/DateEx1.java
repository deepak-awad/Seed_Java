package Lab_Manual.Lab_Exercise_9;

/*** Problem statement 1: Use the date class created in Lab EX1 to swap two dates (Hint: use call by value method) ***/

public class DateEx1 {
	
	int dd;
	int mm;
	int yy;
	
	public DateEx1(int dd,int mm , int yy)
	{
		this.dd=dd;
		this.mm = mm;
		this.yy = yy;
	}
	@Override
	  public String toString() 
	  {
	    return " "+dd+"/"+mm+"/"+yy;
	  }
	
	public static void swap(DateEx1 dt1,DateEx1 dt2)
	 {
	   DateEx1 temp;
	   temp=dt1;
	   dt1=dt2;
	   dt2=temp;
	 }
	
	 public static void main(String[] args) 
	 {
		 
	  DateEx1 d1= new DateEx1(1,1,2001);
	  DateEx1 d2= new DateEx1(2,2,2002);
	  
	  System.out.println("\n\nBefore Swap");
	  System.out.println("d1:"+d1);
	  System.out.println("d2:"+d2);
	  
	  swap(d1,d2); 
	  
	  System.out.println("\n\nAfter Swap");
	  System.out.println("d1:"+d1);
	  System.out.println("d2:"+d2);
	  }

}
