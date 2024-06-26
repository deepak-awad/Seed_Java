package Lab_Manual.Lab_Exercise_N21;
import java.io.*;

/**** Problem Statement 1: Write a class FileDemo which accept 'file.txt'. If the file  is not available then it will throw an exception ''FileNotFoundException' 
 * as well as close that the file in a finally block. ***/

public class FileDemo {
	

	public static void main(String[] args)  {
		
		FileInputStream str = null;
        try {
            str = new FileInputStream("file.txt"); 
            
        } catch (FileNotFoundException e) 
        {
            System.out.println("File not found: " + e.getMessage());
        } 
        finally {
            try {
                if (str != null) 
                {
                    str.close(); 
                }
            } catch (IOException e) 
            {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }

	}

}
