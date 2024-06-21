package DayN12_12;

/*** Wrapper class Example ***/

public class WrapperClass {
	
	public static void main(String args[])
	{
		
		// primitive data into wrapper class object
		int a = 10;
		Integer b = new Integer(a);
		System.out.println(b);
		
		//wrapper class into primitive data 
		int c = b.intValue();
		System.out.println(c);
		
		//string into primitive data 
		String s1 = "30";
		int d = Integer.parseInt(s1);
		System.out.println(d);
		
		//string into primitive data
		String s2 = "30.000";
		double e = Double.parseDouble(s2);
		System.out.println(e);
	
		
		
	}

}
