package DayN12_12_Assignment.Program_6;

public class InvalidChracterFoundExcpetion extends Exception {
	
    String msg;
	
	public InvalidChracterFoundExcpetion()
	{
		msg ="Invalid Character Found Exception";
	}
	public InvalidChracterFoundExcpetion(String msg)
	{
		this.msg = msg;
	}
	public String toString()
	{
		return "Invalid Character Found Exception";
	}

}
