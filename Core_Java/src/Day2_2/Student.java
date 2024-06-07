package Day2_2;

/*** sharpen your pencil Simple class and Object ***/

public class Student {
	
	int rollno;
	String name;
	double percentage;
	
	public void initStudent()
	{
		rollno=10;
		name="Deepak Awad";
		percentage=89.6;
		
	}
	public void printDetails()
	{
		System.out.println("Rollno is :"+rollno+"Nme is:"+name+"Percentage is:"+percentage);
	}

}
