package DayN17_17;
import java.util.Comparator;
import java.util.Scanner;

public class studentNameCompare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }

}
