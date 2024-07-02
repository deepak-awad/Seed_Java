package DayN17_17;
import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;

public class StudentMain {

	public static void main(String[] args) {
		
		ArrayList<Student> s = new ArrayList<>();
		s.add(new Student(1,"hello",15000.0));
		s.add(new Student(2,"depak",25000.0));
		s.add(new Student(3,"yash",50000.0));

		Collections.sort(s ,Comparator.comparing(Student :: getName) );
		
		for(Student s1 : s)
		{
			System.out.println(" "+ s1.name);
		}
	
	}

}
