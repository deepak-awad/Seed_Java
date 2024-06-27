package DayN14_14;
import java.util.*;

/*** Set Tree set Example ***/

class Book1 implements Comparable<Book> {
    int id;
    String name;
    double price;

    public Book1(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Book b) {
        if (this.id > b.id) {
            return 1;
        } else if (this.id < b.id) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class TreeSetBookExample {

    public static void main(String[] args) {
    	
        TreeSet<Book1> t = new TreeSet<>();

        Book1 b1 = new Book1(101, "Deepak Awad", 1500.0);
        Book1 b2 = new Book1(102, "yash Awad", 30000.0);

        t.add(b1);
        t.add(b2);

        for (Book1 b : t) {
            System.out.println(b);
        }
    }
}
