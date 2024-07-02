package DayN17_17;

/*** Student class ***/

public class Student implements Comparable<Student> {
	
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
    
    public int compareTo(Student s)
    {
    	double s1 = this.bal;
    	double s2  = s.bal;
    	if(s1 > s2)
    	return 1;
    	else if(s1 < s2)
    		return -1;
    	return 0;
    }



}
