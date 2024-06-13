package Day6_6;

/*** sharpen your pencil Containtment example with my date as dob ***/

public class MyDate {
	
	int dd;
	int mm;
	int yy;
	
	public MyDate()
	{
		dd=0;
		mm=0;
		yy=0;
	}
	public MyDate(int dd, int mm, int yy)
	{
		this.dd =dd;
		this.mm = mm;
		this.yy = yy;
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}

}
