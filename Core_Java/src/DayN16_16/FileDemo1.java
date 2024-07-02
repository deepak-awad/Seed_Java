package DayN16_16;

import java.io.*;

public class FileDemo1 

{

 public static void main(String[] args) 

 {

   File f= new File("D:/CoreJavaTest/CoreJavaDemos/CoreJavaDemos/src/Day16_1/a.txt");

   System.out.println("File Size:"+f.length());

   System.out.println("File Name:"+f.getName()); 

   System.out.println("File Path:"+f.getAbsolutePath());

   System.out.println("File IS ABS PATH:"+f.isAbsolute());

   System.out.println("File IS DIR:"+f.isDirectory());

   System.out.println("File IS FILE:"+f.isFile());

   

 }//end main

}//end class

