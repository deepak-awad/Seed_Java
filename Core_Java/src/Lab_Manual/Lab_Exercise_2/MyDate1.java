package Lab_Manual.Lab_Exercise_2;

/*** Problem statement 2: Create two objects and initialize them using no-arguments and parameterized constructors respectively. and print the date.   ***/

public class MyDate1 {
	
	int dd, mm, yy;
	
	public MyDate1()
	{
		dd=9;
		mm=10;
		yy=2002;
	}
	public MyDate1(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public void display()
	{
		System.out.println("Date is:"+dd+"/"+mm+"/"+yy);
	}
	public static void main(String[] args) {
		
		MyDate1 m1 = new MyDate1();
		MyDate1 m2 = new MyDate1(10,9,2002);
		m1.display();
		m2.display();
		
	}

}
