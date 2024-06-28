package DayN12_12_Assignment.Program_1;

public class GreaterNumberException extends Exception {
    String msg;
	
	public GreaterNumberException()
	{
		msg = "Greater Number Exception";
	}
	public GreaterNumberException(String msg)
	{
		this.msg =msg;
	}
	public String toString()
	{
		return "Greater Number Exception";
	}

}
