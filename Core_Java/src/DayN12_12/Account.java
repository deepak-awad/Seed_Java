package DayN12_12;

/*** Sharpen yor pencil Account main class  ***/

public class Account {
	
	int acc_No;
	String ownerName;
	double balance;
	
	public Account()
	{
		acc_No=101;
		ownerName ="Deepak Awad";
		balance = 900.0;
	}
	public Account(int no, String name, double bal)
	{
		this.acc_No =no;
		this.ownerName = name;
		this.balance =bal;
	}
	public void withdarw()
	{
		try
		{
		  if(balance < 1000.00)
	     	{
			  throw new InsufficientBalanceException();
	    	}
		  else
		  {
			  System.out.println("Withdraw Amount Successfully");
		  }
		}catch(Exception  e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		Account a = new Account(101,"John Ceina",5000);
		a.withdarw();
	}

}
