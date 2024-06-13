package Day5_5;

/*** VarArgs example addition of number ***/

public class VarArgs {
	
	public static void add(int ...a)
	{
		int sum=0;
		for(int i : a)
		{
			sum = sum + i;
		}
		System.out.println("The sum is:"+sum);
	}
	public static void main(String[] args) 
	{	
		VarArgs a1 = new VarArgs();
		a1.add(10,20,30,40,50);
		a1.add(60,70,80);
	}
}
