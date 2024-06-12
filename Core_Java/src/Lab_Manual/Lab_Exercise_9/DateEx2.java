package Lab_Manual.Lab_Exercise_9;

/*** Problem statement 2: Use the date class created in Lab EX1 to swap two dates (Hint: use call by reference method) ***/

public class DateEx2 {
	
	int dd;
	int mm;
	int yy;
	
	public DateEx2(int dd, int mm,int yy)
	{
		this.dd =dd;
		this.mm = mm;
		this.yy =yy;
	}
	@Override
	  public String toString() 
	  {
	    return " "+dd+"/"+mm+"/"+yy;
	  }
	
	public static void swap(DateEx2 dt[])
	{
		DateEx2 temp;
		temp = dt[0];
		dt[0]=dt[1];
		dt[1]=temp;
	}
	
	public static void main(String[] args) {
		
		DateEx2 dt[] = new DateEx2[2];
		dt[0] =  new DateEx2(1,2,2002);
		dt[1] =  new DateEx2(2,3,2004);
		
		System.out.println("Before Swapping");
		System.out.println("dt[0]:"+dt[0]);
		System.out.println("dt[1]:"+dt[1]);
		
		swap(dt);
		
		System.out.println("After Swapping");
		System.out.println("dt[0]:"+dt[0]);
		System.out.println("dt[1]:"+dt[1]);
		
	
	}

}
