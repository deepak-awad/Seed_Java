package Day2_2;

/*** sharpen your pencil Accessor and Mutator Method ***/

public class Account {
	
	int accNo;
	String ownerName;
	double balance;
	
	public void setAccNo(int no)
	{
		accNo=no;
	}
	public void setOwnerName(String name)
	{
		ownerName=name;
	}
	public void setBalance(double bal)
	{
		balance=bal;
	}
	public int getaccNo()
	{
		return accNo;
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	public double getBalance()
	{
		return balance;
	}
	public void display()
	{
		System.out.println("Accno is:"+accNo+"Owner Name is:"+ownerName+"Balance is:"+balance);
	}

}
