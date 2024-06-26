package Lab_Manual.Lab_Exercise_N22;

/*** Problem Statement 1: When person wants to withdraw money and if balance is not sufficient than throws 
 * an exception 'LessBalanceExcaption'
 * Hint: minimum balance is 1000/- Rs.  ***/

import DayN12_12.InsufficientBalanceException;

public class Account {
	int acc_id;
	String name;
	double bal;
	
	public Account()
	{
		acc_id =101;
		name = "Deepak Awad";
		bal =500;
	}
	public Account(int id, String name, double bal)
	{
		this.acc_id = id;
		this.name = name;
		this.bal = bal;
	}
	public void balance()
	{
		try
		{
			if(bal < 1000.00)
	     	{
			  throw new LessBalanceException();
	    	}
		  else
		  {
			  System.out.println("Withdraw Amount Successfully");
		  }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		Account a = new Account();
		a.balance();
	}

}
