package Day2_2_HomeWork;

/*** Home Work Accessor and Mutator Method ***/

public class Chair {
	
	int id;
	String name,color;
	double price;
	
	public void setId(int id1 )
	{
		id = id1;
	}
	public void setname(String name1 )
	{
		name = name1;
	}
	public void setColor(String Color1 )
	{
		color = Color1;
	}
	public void setPrice(double price1 )
	{
		price = price1;
	}
	public int getId()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public String getColor()
	{
		return color;
	}
	public double getPrice()
	{
		return price;
	}
	public void printDetails()
	{
		System.out.println("id is :"+id+"\nName is:"+name+"\nColor is:"+color+"\nprice:"+price);
	}
	
	public static void main(String args[])
	{
		Chair c1 = new Chair();
		c1.setId(102);
		c1.setname("HomeTown");
		c1.setColor("Yellow");
		c1.setPrice(2000.15);
		c1.printDetails();
	}

}
