package Lab_Manual.Lab_Exercise_N17;

/*** Describe the Account class with attribute like account id, account name, balance. In 'Account class' there is a class called like locker with keep information 
 * regarding 'Locker' like locker id. print Account information inside Locker class.   ***/

class Account
{
	int accountid;
	String acc_name;
	float balance;
	
	public Account()
	{
		accountid =0;
		acc_name =null;
		balance=0.0f;
	}
	public Account(int id, String name, float balance)
	{
		this.accountid =id;
		this.acc_name = name;
		this.balance = balance;
	}
	class Locker
	{
		int lockid;
		
		public Locker()
		{
			lockid =0;
		}
		public Locker(int id)
		{
			this.lockid = id;
		}
		public void display()
		{
			System.out.println("Account id:"+accountid+"\nAcount name:"+acc_name+""
					+ "\nBalance is:"+balance+"\nLocker id:"+lockid);
		}
	}
	
}
public class Main {
	
	public static void main(String args[])
	{
	
	Account a = new Account(1,"new",1500f);
	
	Account.Locker l = a.new Locker(102);
	l.display();
	}

}
