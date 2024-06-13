package Day6_6;

/*** sharpen your pencil Containtment example with my date as product in Product***/

public class Product {
	
	int pid;
	String name;
	MyDate d1;
	
	public Product()
	{
		pid = 101;
		name="Testng one";
		d1= new MyDate(1,10,2002);
	}
	public Product(int ac, String name, MyDate d)
	{
		this.pid = ac;
		this.name= name;
		this.d1 = d;
	}
	public String toString()
	{
		return "acc no:"+pid+"name is: "+name+" Dob is:"+d1;
	}


}
