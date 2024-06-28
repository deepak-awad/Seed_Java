package DayN12_12_Assignment.Program_5;

public class InvalidPasswordException extends Exception {
	
    String msg;
	
	public InvalidPasswordException()
	{
		msg ="Invalid Password Exception";
	}
	public InvalidPasswordException(String msg)
	{
		this.msg = msg;
	}
	public String toString()
	{
		return "Invalid Password Exception";
	}

}
