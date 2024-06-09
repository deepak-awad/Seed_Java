package Lab_Manual.Lab_Exercise_1;

/*** Problem statement 1: Construct a class with MyDate which has attributes- day, month, year. and use initDate method to print date.   ***/


public class MyDate {
	int day;
	int month;
	int year;
	
	public void initDate()
	{
		day = 10;
		month = 9;
		year = 2002;
		
	}
	public void printDate()
	{
		System.out.println("Date :"+day+"/"+month+"/"+year);
	}

	public static void main(String[] args) {
		
		MyDate d1 = new MyDate();
		d1.initDate();
		d1.printDate();

	}
}
