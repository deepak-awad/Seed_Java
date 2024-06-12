package Day5_5;

/*** Call by Reference in a array ***/

public class CallByReference {
	
	int dd;
	int mm;
	int yy;
	
	public CallByReference(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public static void swap(CallByReference c1[])
	{
		CallByReference temp;
		temp = c1[0];
		c1[0]=c1[1];
		c1[1]=temp;
	}
	@Override
	  public String toString() 
	  {
	    return " "+dd+"/"+mm+"/"+yy;
	  }

	public static void main(String[] args) {
		
		CallByReference c1[] = new CallByReference[2];
		c1[0] = new CallByReference(10,10,2024);
		c1[1] = new CallByReference(5,12,2004);
		
		System.out.println("\n\nBefore Swap");
		System.out.println("d1:"+c1[0]);
		System.out.println("d2:"+c1[1]);
		  
		swap(c1); 
		  
		System.out.println("\n\nAfter Swap");
		System.out.println("d1:"+c1[0]);
		System.out.println("d2:"+c1[1]);
		
	}

}
