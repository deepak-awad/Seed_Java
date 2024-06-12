package Day4_4;

/*** sharpen your pencil Static field and method Account class ***/

public class Account {
	
	static float interestrate;
	
	static
	{
		interestrate = 3.5f;
	}
	
	public static void getInterestRate()
	{
		System.out.println("Intrest rate is: "+interestrate);
	}

}
