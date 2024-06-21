package DayN12_12;
import java.io.*;

/*** Try Catch Example 2 ***/

public class TryCatchExample2 {
	
	public static void main(String args[]) throws IOException
	{
		int ch=0;
		FileInputStream sc = null;
		try
		{
		 sc = new FileInputStream("C:\\Users\\awadd\\Desktop\\hello.txt");
		
		while(true)
		{
			ch =sc.read();
			if(ch == -1)
				break;
			System.out.print((char)ch);
			
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
		
		
	}

}
