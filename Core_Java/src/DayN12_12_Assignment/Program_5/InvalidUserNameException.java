package DayN12_12_Assignment.Program_5;

public class InvalidUserNameException extends Exception {
	
    String msg;
	
	public InvalidUserNameException()
	{
		msg ="Invalid User Name Exception";
	}
	public InvalidUserNameException(String msg)
	{
		this.msg = msg;
	}
	public String toString()
	{
		return "Invalid User Name Exception";
	}

}
