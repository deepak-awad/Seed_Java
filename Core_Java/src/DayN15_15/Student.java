package DayN15_15;

public class Student {
	
	int id;
	String name;
	
	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public void setId(int id)
	{
		this.id = id;
		
	}
	public int getId()
	{
		return id;
	}
	public void setName1(String name)
	{
		this.name = name;
	}
	public String getName1()
	{
		return name;
	}
	public String toString()
	{
		return "Id:"+id+"\nName:"+name;
	}
	public void display()
	{
		
	}

	

}
