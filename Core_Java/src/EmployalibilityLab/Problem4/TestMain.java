package EmployalibilityLab.Problem4;

import java.util.Arrays;
import java.util.Scanner;

public class TestMain {

    public static void main(String args[]) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        int num =0;

        Book b[] = new Book[100];

        do {
            System.out.println("1) Add elements using setter method");
            System.out.println("2) Sort the array");
            System.out.println("3) Search a book");
            System.out.println("0) Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the number of books to add:");
                    num = sc.nextInt();

                    for (int i = 0; i < num; i++) {
                        System.out.println("Enter book name:");
                        String name = sc.next();

                        System.out.println("Enter book price:");
                        int price = sc.nextInt();

                        System.out.println("Enter book author:");
                        String author = sc.next();

                        b[i] = new Book(name, price, author);
                    }
                    break;

                case 2:
                    Arrays.sort(b, 0, num);
                    System.out.println("The sorted array is:");
                    for (int i = 0; i < num; i++) {
                        System.out.println(b[i]);
                    }
                    break;

                case 3:
                    System.out.println("Enter book name to search:");
                    String searchName = sc.next();
                    boolean found = false;
                    for (int i = 0; i < num; i++) {
                        if (b[i].getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Book found:");
                            System.out.println(b[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice...");
            }

        } while (choice != 0);

        sc.close();
    }

}
