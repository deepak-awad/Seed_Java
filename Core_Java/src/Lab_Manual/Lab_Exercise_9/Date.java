package Lab_Manual.Lab_Exercise_9;

/*** Problem Statement 1: An employee has a date of joining. so we define an object of Date class as a contained object in the Employee class. 
 * make an appropriate changes in constructors and method the display the employee details. ++In single class implement++ ***/

public class Date {
    int dd;
    int mm;
    int yy;

    public Date() {
        dd = 0;
        mm = 0;
        yy = 0;
    }

    public Date(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    public String toString() {
        return dd + "/" + mm + "/" + yy;
    }
}

class Employee {
    int empid;
    Date d1;

    public Employee() {
        empid = 0;
        d1 = new Date(10, 02, 2002);
    }

    public Employee(int empid, Date d1) {
        this.empid = empid;
        this.d1 = d1;
    }

    public String toString() {
        return "empid: " + empid + "\n Date of Joining is:" + d1;
    }

    public static void main(String args[]) {
        Employee e1 = new Employee(102, new Date(10, 05, 2003));
        System.out.println(e1.toString());
    }
}
