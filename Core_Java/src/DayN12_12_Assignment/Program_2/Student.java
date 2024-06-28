package DayN12_12_Assignment.Program_2;
import java.util.Scanner;

/*** Write a Java Program create a class student with member
fields student id,name,age and member methods default
constructor,acceptData,displayData.
if name is not valid then raise NameException
if age is not >18 then raise AgeException  ***/

public class Student {

    Scanner sc = new Scanner(System.in);

    int student_id;
    String name;
    int age;

    public Student() {
  
    }

    public Student(int id, String name, int age) {
        this.student_id = id;
        this.name = name;
        this.age = age;
    }

    public void accept() throws NameException, AgeException {
        System.out.println("Enter your id: ");
        student_id = sc.nextInt();

        System.out.println("Enter your name : ");
        name = sc.next();
        String str = "1234567890@#$%^";
        for (char c : str.toCharArray()) {
            if (name.contains(Character.toString(c))) {
                throw new NameException();
            }
        }

        System.out.println("Enter your age: ");
        age = sc.nextInt();
        if (age < 18) {
            throw new AgeException();
        }
    }

    public void display() {
        System.out.println("Id is: " + student_id);
        System.out.println("Your Name is : " + name);
        System.out.println("Your age is: " + age);
    }

    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter number of students you want to add:");
        int n = sc1.nextInt();
        
        Student s[] = new Student[n]; 

        try {
            for (int i = 0; i < n; i++) { 
                s[i] = new Student();
                s[i].accept();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
