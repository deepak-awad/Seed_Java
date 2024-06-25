package DayN12_12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryCatchFileWrite {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\awadd\\Desktop\\hello.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            String content = "Hello, world!\nThis is a file write example.";
            writer.write(content);
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
