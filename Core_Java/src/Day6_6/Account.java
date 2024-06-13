package Day6_6;

/*** sharpen your pencil Containtment example with my date as dob in Account***/

public class Account {
	
	int acid;
	String name;
	MyDate d1;
	
	public Account()
	{
		acid = 101;
		name="Testng one";
		d1= new MyDate(1,10,2002);
	}
	public Account(int ac, String name, MyDate d)
	{
		this.acid = ac;
		this.name= name;
		this.d1 = d;
	}
	public String toString()
	{
		return "acc no:"+acid+"name is: "+name+" Dob is:"+d1;
	}

}
