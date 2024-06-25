package DayN13_13;

/*** Genric Example  ***/

public class MyObject 
{
	Object obj;  

	public MyObject(Object obj)
	  {

		this.obj=obj;

	  }  
	 public Object get()
	  {

		  return obj;

	  }  

	public static void main(String[] args) 
	{
		MyObject m=new MyObject(new Integer(10));
		Integer n=(Integer)m.get();
		
		 MyObject m1=new MyObject("Hello");

		 String str=(String)m1.get();
		 
	     System.out.println(n);

	     System.out.println(str);


	}

}
