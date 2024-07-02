package Lab_Manual.Lab_Exercise_N25;
import java.lang.reflect.*;

/*** Problem Statement 1: Write a class 'Reflect Demo' to find out information of 'Employee' class and related classes 
 * of Employee. Use method like getClass(), Class.forName(), newInstance()  ***/

public class ReflectDemo {
	
	public ReflectDemo()
	{
		
	}
	
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		ReflectDemo d1 = new ReflectDemo();
		System.out.println(d1.getClass());
		
		Class c1 = d1.getClass();
		System.out.println(c1);
		
	 //  Class c2 = Class.forName("ReflectDemo");
	 //  System.out.println(c2);
	   
	  // ReflectDemo d2 =(ReflectDemo) Class.forName("ReflectDemo").newInstance();
	  // System.out.println(d2);
		
		    Constructor cd[]= c1.getDeclaredConstructors();
	        System.out.println("\n\nEmployee class Constructors  are:");
	        for(int i=0;i<cd.length;i++)
	        {
	        	System.out.println(""+cd[i]);
	        }
		
	        Method dd[] = c1.getDeclaredMethods();
	        System.out.println("\n\nEmployee class Constructors  are:");
	        for(int i=0;i<dd.length;i++)
	        {
	          System.out.println(""+dd[i]);
	        }
	        
	        Field  fd[]= c1.getDeclaredFields();
			System.out.println("\n\nEmployee class Fields are:");
			 for(int i=0;i<fd.length;i++)
			  {
			     System.out.println(""+fd[i]);
			  }
		
		
	}

	

}
