package Day7_7_Assignment.Program_3;
import java.util.Scanner;


/*** Write a Java Program to create a class Student having member
fields student_Id,student_name,Marks of three subjects(Use array for marks),
average,grade and member methods are default constructor,parameterized constructor
add student,calculate average and assign grade,display all student details,
display student details by name,display student details by Id.
Use Hints:
 Student Id is auto generated.
 Display methods are overloaded.
 Array of objects
 Write Menu Driven Program.
 Add necessary Fields or methods in class. ***/

public class Student {
	int student_id;
	String student_name;
	double marks[];
	static int count;
	static int n;
	
	public Student()
	{
		student_id = ++count;
		student_name = null;
	}
	public Student(String name, double mark[])
	{
		student_id = ++count;
		this.marks = mark;
		this.student_name = name;
		
	}
	public void calculate()
	{
		int total = 0;
		for(double m : marks)
		{
			total += m;
		}
		double average = total / marks.length;
		System.out.println("Average marks are: "+average);
		
		if(average > 90)
		{
			System.out.println("The Grade is: A ");
		}
		else if(average >80)
		{
			System.out.println("The Grade is: B ");
		}
		else if(average > 70 )
		{
			System.out.println("The Grade is: C ");
		}
		else if(average > 80)
		{
			System.out.println("The Grade is: D ");
		}
		else
		{
			System.out.println("The Grade is: E ");
		}
	}
	public void display()
	{
		System.out.println("Student id:"+student_id);
		System.out.println("Student Name is:"+student_name);
		for(double m : marks)
		{
			System.out.println("Subject marks m"+ n++ +": "+m);
		}
		
	}

	public static void main(String[] args) {
		
		Student student[] = new Student[100];
		
		int choice;
		do
		{
			System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Calculate Average and ASSSIGN GRADE");
            System.out.println("3. Display All Student Details");
            System.out.println("4. Display Book Details by student name");
            System.out.println("5. Display Book Details by student ID");
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            
            switch(choice)
            {
            
            
            case 1: 
            	System.out.println("1. Add Student");
            	System.out.println("Enter number of Student to add");
            	Scanner sc1 = new Scanner(System.in);
            	int no1 = sc1.nextInt();
            	
            	for(int i =0;i< no1; i++)
            	{
            		int balance;
         
            		System.out.println("Enter Student name: ");
            		Scanner sc3= new Scanner(System.in);
            		String name = sc3.next();

            		System.out.println("Enter Subject marks m1:: ");
            		Scanner sc4= new Scanner(System.in);
            		int m1= sc4.nextInt();

            	    System.out.println("Enter Subject marks m2:: ");
                	Scanner sc5= new Scanner(System.in);
                	int m2= sc5.nextInt();
                	
                	System.out.println("Enter Subject marks m3: ");
                	Scanner sc6= new Scanner(System.in);
                	int m3= sc6.nextInt();
       
            		double Marks[] = {m1, m2,m3};
            		
            		student[i] = new Student( name,Marks);	
            	}
            	
            	break;
            	
            	
            case 2: 
            	  System.out.println("2. Calculate Average and ASSSIGN GRADE");
            	  for(Student m : student)
            	  {
            		  if(m != null)
            		  {
            		  m.calculate();
            		  break;
            		  }
            	  }
            	break;
            	
            	
            case 3:
            	System.out.println("3. Display All Student Details");
            	for(Student s : student)
            	{
            		if( s != null)
            		{
            			s.display();
	                    System.out.println();
            		
            		}
            		else
            		{
	                    System.out.println("All students are not availabe");
	                    break;
            		}
            	}
            	
            	break;
            	
            	
            case 4:
            	 System.out.println("4. Display Book Details by student name");
            	 System.out.println("Enter student name :");
            	 Scanner sc8 = new Scanner(System.in);
            	 String name = sc8.next();
            	 for(int i =0; i<student.length;i++)
            	 {
            		 if(student[i].student_name.equals(name))
            		 {
            			 student[i].display();
            			 break;
            		 }
            	 }
            	break;
            	
            	
            case 5:
            	System.out.println("5. Display Book Details by student ID");
            	 System.out.println("Enter student name :");
            	 Scanner sc12 = new Scanner(System.in);
            	 int id= sc12.nextInt();
            	 for(int i =0; i<student.length;i++)
            	 {
            		 if(student[i].student_id == id)
            		 {
            			 student[i].display();
            			 break;
            		 }
            	 } 	
            	break;
            	
            	default:
            		System.out.println("Invalid Attempt");
            }
            
		}while(choice != 0);
	}

}
