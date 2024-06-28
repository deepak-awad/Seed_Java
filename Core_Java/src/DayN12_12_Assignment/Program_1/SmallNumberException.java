package DayN12_12_Assignment.Program_1;

public class SmallNumberException extends Exception {
	String msg;
	
	public SmallNumberException()
	{
		msg = "Small Number Exception";
	}
	public SmallNumberException(String msg)
	{
		this.msg =msg;
	}
	public String toString()
	{
		return "Small Number Exception";
	}

}
