package Lab_Manual.Lab_Exercise_N19;

/*** Problem Statement 2: Use the same class to check the Auto boxing and Auto unboxing concepts. ***/

public class AutoandUnBoxing {
	
	public static void main(String args[])
	{
		//Autboxing converts the primitive to wrapper class
		int primitiveInt = 10;
		Integer wrapperInt = primitiveInt;
		System.out.println(wrapperInt); 
		
		//Autounboxing converts the wrapper class to primitive 
		
		Integer str = new Integer(15);
		int  i = str;
		System.out.println(i);
		
	}

}
