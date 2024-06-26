package Lab_Manual.Lab_Exercise_N20;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

/*** Problem Statement 1: Create a 'FileDemo.java' to check the file 'file1.text' is available or not. Also find out the file
 * information about the same file.  ***/

public class FileDemo {
    public static void main(String[] args) {
    	
        String filePath = "C:\\Users\\awadd\\git\\repository4\\Core_Java\\src\\Lab_Manual\\Lab_Exercise_N20\\data.txt";
        
        File f = new File(filePath);
        
        if(f.exists())
        {
        	System.out.println("File Exists");
        	
        }else
        {
        	System.out.println("File Not Exists");
        }
        
        Path path = Paths.get(filePath);

        try {
            BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

            System.out.println("File size: " + attr.size());
            System.out.println("Last modified time: " + attr.lastModifiedTime());
            System.out.println("Is directory: " + attr.isDirectory());
            System.out.println("Is regular file: " + attr.isRegularFile());
            System.out.println("Is symbolic link: " + attr.isSymbolicLink());
            System.out.println("File owner: " + Files.getOwner(path));
            System.out.println("File permissions: " + Files.getPosixFilePermissions(path));
        } catch (Exception e) {
            System.err.println("Failed to read file attributes: " + e.getMessage());
        }
    }
}
