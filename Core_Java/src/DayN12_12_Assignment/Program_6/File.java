package DayN12_12_Assignment.Program_6;
import java.io.*;

public class File {

	public static void main(String[] args) {
		
		FileInputStream str =null;
		try
		{
			str = new FileInputStream("C:\\Users\\awadd\\git\\repository4\\Core_Java\\src\\DayN12_12_Assignment\\Program_6\\data.txt");
		    
		    while(true)
		    {
		    	str.read();
		    	System.out.println(str.read());
		    }
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
