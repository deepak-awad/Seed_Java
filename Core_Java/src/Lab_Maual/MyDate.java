package Lab_Maual;

/*** Lab Manual 1 - Lab Exercise 1 ***/

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
