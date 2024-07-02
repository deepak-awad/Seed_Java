package DayN16_16;

import java.io.*;

public class FileDemo 

{

  File f;

  String fnm,path,abspath;

  long size;

  public FileDemo() throws Exception

  {

	 f=new File("b.txt"); 

	 if(f.exists()==true)

	 {

		 System.out.println("File is exists");

	 }

	 else

	 {

		 f.createNewFile();

		 System.out.println("File does not exists");

	 }

	 

	 size=f.length();

	 System.out.println("Size:"+size);

	 System.out.println("abs path:"+f.getAbsolutePath());

  }

  

	public static void main(String[] args) throws Exception 

	{

		

      FileDemo fob=new FileDemo();  

	}



}
