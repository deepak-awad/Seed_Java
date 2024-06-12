package Day5_5;

/*** Call by value in a array ***/

public class CallByValue {
	
	int dd;
	int mm;
	int yy;
	
	public CallByValue(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public static void swap(CallByValue v1, CallByValue v2)
	{
		CallByValue temp;
		temp = v1;
		v1= v2;
		v2=temp;
		
	}
	public String toString()
	{
		return " "+dd+"/"+mm+"/"+yy;
	}
	public static void main(String args[])
	{
		CallByValue v1 = new CallByValue(2,10,2002);
		CallByValue v2 = new CallByValue(11,12,2002);
		
		System.out.println("\n\nBefore Swap");
	    System.out.println("d1:"+v1);
	    System.out.println("d2:"+v2);
	    
		swap(v1,v2);
		
		System.out.println("\n\nAfter Swap");
		System.out.println("d1:"+v1);
		System.out.println("d2:"+v2);
		
	}
}
