package Lab_Manual.Lab_Exercise_2;

/*** Problem statement 1: Construct an object and initialize it using mutator method and access it using accessor methods. print the date.   ***/

public class MyDate {
	
int date,month,year;
	
	public void setDate(int d)
	{
		date = d;
	}
	public void setMonth(int m)
	{
		month = m;
	}
	public void setYear(int y)
	{
		year = y;
	}
	public int getDate()
	{
		return date;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	
	public void display()
	{
		System.out.println("Date is:"+date+"/"+month+"/"+year);
	}

	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		d1.setDate(10);
		d1.setMonth(9);
		d1.setYear(2002);
		d1.display();
		

	}

}
