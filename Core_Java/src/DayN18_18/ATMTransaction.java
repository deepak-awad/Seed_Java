package DayN18_18;
public class ATMTransaction extends Thread 
{
	Account ac;
	double amount;
	boolean flag;
	
	public ATMTransaction() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public ATMTransaction(Account ac, double amount, boolean flag) 
	{
		super();
		this.ac = ac;
		this.amount = amount;
		this.flag = flag;
	}



	@Override
	public void run() 
	{
		try 
		{
			if(flag==true)
				ac.withdraw(amount);
			else
				ac.deposite(amount);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) 
	{
		Account ac = new Account(12345, "Rohit Patil", 10000.00);
		Thread t1 = new ATMTransaction(ac, 2000.00, true);
		Thread t2 = new ATMTransaction(ac, 3000.00, false);
		t1.start();
		t2.start();
	}

}
