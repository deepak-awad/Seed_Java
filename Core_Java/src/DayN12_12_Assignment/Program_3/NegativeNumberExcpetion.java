package DayN12_12_Assignment.Program_3;

public class NegativeNumberExcpetion extends Exception {
	
	String msg;
	
	public NegativeNumberExcpetion()
	{
		msg ="Neagtive Number Exception";
	}
	public NegativeNumberExcpetion(String msg)
	{
		this.msg = msg;
	}
	public String toString()
	{
		return "Neagtive Number Exception";
	}

}
