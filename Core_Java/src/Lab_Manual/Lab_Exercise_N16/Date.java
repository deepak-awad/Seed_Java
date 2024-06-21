package Lab_Manual.Lab_Exercise_N16;

/***Problem Statement 1: Clone the object of Date class by implementing the cloneable interface   ***/

public class Date implements Cloneable  {
	
	int dd;
	int mm;
	int yy;
	
	public Date()
	{
		dd=0;
		mm=0;
		yy =0;
	}
	public Date(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	protected Date Clone() throws CloneNotSupportedException
	{
		return (Date) super.clone();
	}
	
	
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Date d;
		d= new Date();
		System.out.println(d.toString());
		
		Date d2 = new Date();
		System.out.println(d.toString());
		
		Date d3 =(Date) d.Clone();
		System.out.println(d3.toString());
		
		
		
		
	}

}
