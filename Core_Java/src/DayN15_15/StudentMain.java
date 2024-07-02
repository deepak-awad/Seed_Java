package DayN15_15;

import java.lang.reflect.*;

public class StudentMain {
	
	public static void main(String args[])
	{
		Student s = new Student(1,"Deepak");
		
		Class e1 = s.getClass();
		
		System.out.println("check class name: "+s.getClass());
		
		Field  fd[]= e1.getDeclaredFields();
		 System.out.println("\n\nEmployee class Fields are:");
		    for(int i=0;i<fd.length;i++)
		    {
		    	System.out.println(""+fd[i]);
		    }

        System.out.println("Check constructors: ");
        
        Constructor cd[]= e1.getDeclaredConstructors();
        System.out.println("\n\nEmployee class Constructors  are:");
        for(int i=0;i<cd.length;i++)
        {
        	System.out.println(""+cd[i]);
        }
        
        System.out.println("Check methods: ");
        Method md[] = e1.getDeclaredMethods();
        System.out.println("\n\nEmployee class Constructors  are:");
        for(int i=0;i<md.length;i++)
        {
        	System.out.println(""+md[i]);
        }
        
	}

}
