package DayN12_12_Assignment.Program_2;

public class AgeException extends Exception{

    String msg;
	
	public AgeException()
	{
		super();
	}
	public AgeException(String msg)
	{
		this.msg = msg;
	}
	public String toString()
	{
		return "Age Exception";
	}
}
