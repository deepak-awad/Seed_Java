package DayN17_17;

/*** Student class ***/

public class Student {
	
	int id;
	String name;
	double bal;
	
	public Student()
	{
		id = 0;
		name = "Deepak";
		bal = 40.0;
	}
	public Student(int id, String name, double bal)
	{
		this.id = id;
		this.name = name;
		this.bal = bal;
		
	}
	public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return bal;
    }



}
