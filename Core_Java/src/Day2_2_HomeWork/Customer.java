package Day2_2_HomeWork;

/*** Home Work Accessor and Mutator Method ***/

public class Customer {
	
	int id;
	long number;
	String name, email;
	
	public void setId(int id1 )
	{
		id = id1;
	}
	public void setNumber(long number1 )
	{
		number = number1;
	}
	public void setname(String name1 )
	{
		name = name1;
	}
	public void setEmail(String Email1 )
	{
		email = Email1;
	}
	
	public int getId()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public long getNumber()
	{
		return number;
	}
	public void printDetails()
	{
		System.out.println("id is :"+id+"\nName is:"+name+"\nNumber is:"+number+"\nEmail:"+email);
	}

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.setId(102);
		c1.setNumber(8459467448l);
		c1.setname("John Ceina");
		c1.setEmail("Ceina@gmail.com");
		c1.printDetails();

	}

}
