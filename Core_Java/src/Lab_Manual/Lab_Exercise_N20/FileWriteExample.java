package Lab_Manual.Lab_Exercise_N20;
import java.io.FileWriter;

/*** Problem Statement 2: Accept the input from console and write in a file 'console.txt'. Use System class ***/
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
    	
    	String str ="Deepak AWAD";

        FileWriter sc = null;
        try {
            sc = new FileWriter("C:\\Users\\awadd\\git\\repository4\\Core_Java\\src\\Lab_Manual\\Lab_Exercise_N20\\data.txt");
            sc.write(str);
            sc.close();
            System.out.println("File write successful");
            
        } catch (IOException e)
        {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } 
        finally 
        {
            try 
            {
                if (sc != null) 
                {
                    sc.close();
                }
            } 
            catch (IOException e)
            {
                System.out.println("Error closing FileWriter: " + e.getMessage());
            }
        }
    }
}
