package Lab_Manual.Lab_Exercise_N22;

public class LessBalanceException extends Exception {
	
	String msg;
	
	public LessBalanceException()
	{
		msg = "Default: LessBalanceException e";
	}
	public LessBalanceException(String msg)
	{
		this.msg = msg;
	}
	public String toString()
	{
		return "Less Balance Exception";
	}

}
