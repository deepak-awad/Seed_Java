package DayN12_12_Assignment.Program_2;

public class NameException extends Exception {
	
	String msg;
	
	public NameException()
	{
		super();
	}
	public NameException(String msg)
	{
		this.msg = msg;
	}
	public String toString()
	{
		return "Name Exception";
	}

}
