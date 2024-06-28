package DayN12_12_Assignment.Program_1;

public class ProperNumberException extends Exception{
	
String msg;
	
	public ProperNumberException()
	{
		msg = "Proper Number Exception";
	}
	public ProperNumberException(String msg)
	{
		this.msg =msg;
	}
	public String toString()
	{
		return "Proper Number Exception";
	}

}
