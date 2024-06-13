package Lab_Manual.Lab_Exercise_N11;
import java.lang.*;

/***  Problem Statement 1: Declare enum of weekday : Print number of day ***/

enum Weekday
{
	SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);
	
	private final int daynumber;
	
	Weekday(int day)
	{
		this.daynumber = day;
	}
	public int getnumber()
	{
		return daynumber;
	}
}

public class Main
{
	public static void main(String args[])
	{
		for(Weekday w : Weekday.values())
		{
			System.out.println(w.getnumber()+" "+w.name().toLowerCase() );
		}
	}
}
