package Day2_2_HomeWork;

/*** Home Work Accessor and Mutator Method ***/

public class MobileDevice {
	
	int id;
	String name,Ram;
	double price;
	
	public void setId(int id1 )
	{
		id = id1;
	}
	public void setname(String name1 )
	{
		name = name1;
	}
	public void setRam(String Ram1 )
	{
		Ram = Ram1;
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
	public String getRam()
	{
		return Ram;
	}
	public double getPrice()
	{
		return price;
	}
	public void printDetails()
	{
		System.out.println("id is :"+id+"\nName is:"+name+"\nram is:"+Ram+"\nprice:"+price);
	}

	public static void main(String[] args) {
		
		MobileDevice d1 = new MobileDevice();
		d1.setId(102);
		d1.setname("Nokia pro");
		d1.setRam("4 Gb");
		d1.setPrice(2000.15);
		d1.printDetails();

	}

}
