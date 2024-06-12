package Lab_Manual.Lab_Exercise_5;

/*** Problem statement 1: write a method in a date class that prints the date using constructor chaining  ***/

public class Date {
	
	private int dd;
	private int mm;
	private int yy;
	
	public Date()
	{
		this(1, 10, 2002);
	}
	public Date(int dd, int mm)
	{
		this(dd, mm, 2003);
	}
	public Date(int dd, int mm,int yy)
	{
		this.dd = dd;
		this.mm =mm;
		this.yy = yy;
	}
	public void display()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}

	public static void main(String[] args) {
		Date d1 = new Date();
		d1.display();
		Date d2 = new Date(10,9,2015);
		d2.display();
		

	}

}
