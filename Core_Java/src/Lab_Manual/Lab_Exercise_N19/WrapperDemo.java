package Lab_Manual.Lab_Exercise_N19;

/*** Problem Statement 1: Write a class 'wrapperDemo' class to check all the important methods of wrapper class. ***/

public class WrapperDemo {
	
	public static void main(String args[])
	{
	
	        //value of
		    Integer I = Integer.valueOf("10"); 
	        System.out.println(I); 
	        
	        Double D = Double.valueOf("10.0"); 
	        System.out.println(D); 
	        
	        Boolean B = Boolean.valueOf("true"); 
	        System.out.println(B); 
	  
	        
	        
	       //parse xxx()method
	        int i = Integer.parseInt("10"); 
	        double d = Double.parseDouble("10.5"); 
	        boolean b = Boolean.parseBoolean("true"); 
	        
	        System.out.println(i); 
	        System.out.println(d); 
	        System.out.println(b);
	        
	        // to string() method
	        Integer I1 = new Integer(10); 
	        String s = I1.toString(); 
	        System.out.println(s);

	}
}
