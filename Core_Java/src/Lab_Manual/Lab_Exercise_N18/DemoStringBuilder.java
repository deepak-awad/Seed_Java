package Lab_Manual.Lab_Exercise_N18;

/*** Problem Statement 3: Write a 'DemoStringBuilder' class to check all the important methods of stringBuilder class.  ***/

public class DemoStringBuilder {
	
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("Hello");
		// Append into String...
		str.append(" World !!");
		System.out.println(str);
		
		// insert into String...
		str.insert(14,"Java");
		System.out.println(str);
		
		// replace the String...
		str.replace(6,11,"Java");
		System.out.println(str);
		
		// delete the String...
		str.delete(6,11);
		System.out.println(str);
		
		// reverse the String...
		str.reverse();
		System.out.println(str);
		
		// capacity the String...
		System.out.println(str.capacity());
		System.out.println(str);
		
		str.append("Java is my favourite language"); 
		System.out.println(str.capacity());
		System.out.println(str);
		
	}

}
