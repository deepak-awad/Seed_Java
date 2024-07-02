package DayN16_16;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

public class FileReadWriteDemo2 

{

 public static void main(String[] args) throws IOException 

 {

  FileInputStream fis=null;	 

  FileOutputStream fos=null;

  try

   {

     fis= new FileInputStream("C:\\Users\\awadd\\git\\repository4\\Core_Java\\src\\DayN16_16\\a.txt");

     fos= new FileOutputStream("c.txt",true); 

     int data=0;

	while((data=fis.read())!=-1)

	{

	   fos.write(data);

	}   

	System.out.println("Data Copy Successfully...!!");

  }

 catch(FileNotFoundException e) 

 {

  e.printStackTrace();

 }//end catch

 }//end main

}//end class
