package Lab_Manual.Lab_Exercise_N10;

/*** Problem Statement 1: An employee has a date of joining. so we define an object of Date class as a contained object in the Employee class. 
 * make an appropriate changes in constructors and method the display the employee details. ***/

public class DateofJoining {
	
	int dd;
	int yy;
	int mm;
	
	public DateofJoining()
	{
		dd=0;
		yy=0;
		mm=0;
	}
	public DateofJoining(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}

}
