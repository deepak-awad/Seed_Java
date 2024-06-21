package DayN12_12;

/*** Sharpen your pencil Insufficient Main Balance Exception user defined  ***/

public class InsufficientBalanceException extends Exception{
	
	String msg;
	
	public InsufficientBalanceException()
	{
		msg="Default: Insufficient Balance Exception ";
		
	}
	public InsufficientBalanceException(String msg)
	{
		this.msg = msg;
	}
	public String toString()
	{
		return "Exception: ["+msg+"]";
	}
	public String getMessage()
	{
		return "Insufficient Balance Exception";
	}

}
