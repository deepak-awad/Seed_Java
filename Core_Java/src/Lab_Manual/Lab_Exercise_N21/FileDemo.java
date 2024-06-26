package Lab_Manual.Lab_Exercise_N21;
import java.io.*;

/**** Problem Statement 1: Write a class FileDemo which accept 'file.txt'. If the file  is not available then it will throw an exception ''FileNotFoundException' 
 * as well as close that the file in a finally block. ***/

public class FileDemo {
	

	public static void main(String[] args) throws IOException {
		
		FileInputStream str =null;
		try
		{
			 str = new FileInputStream("Hello.text");
			
			
		}catch(Exception e)
		{
			System.out.println("File not found");
		}finally
		{
			str.close();
		}

	}

}
