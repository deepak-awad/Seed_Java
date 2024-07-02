package DayN16_16;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

public class FileReadDemo1 

{

 public static void main(String[] args) throws IOException 

 {

  FileInputStream fis=null;	 

  try

  {

    fis= new FileInputStream("D:\\CoreJavaTest\\CoreJavaDemos\\CoreJavaDemos\\src\\Day16_1\\a.txt");

    int data=0;

    char ch;

	while((data=fis.read())!=-1)

	{

		ch=(char)data;

		System.out.print(""+ch);

	}   

  }

  catch(FileNotFoundException e) 

  {

	e.printStackTrace();

  }//end catch

 }//end main

}//end class
