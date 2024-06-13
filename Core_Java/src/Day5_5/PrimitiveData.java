package Day5_5;

/*** Primitive data type example ***/

public class PrimitiveData {
	
	public void m1(int x)
	{
		System.out.println("value of x:"+x);
		  x=x+5;
		  System.out.println("\nvalue of x:"+x);
	}

	public static void main(String[] args) {
		int n=5;
		PrimitiveData d1 = new PrimitiveData(); 
		System.out.println("The value of x: "+n);
		d1.m1(n);
		System.out.println("The value of x: "+n);
	}
	
}
