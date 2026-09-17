package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        String filename = "Rashmi.txt";

        try(FileWriter writer = new FileWriter(filename)){
            writer.write("hello, my name is thsi and this");

            writer.flush();

            System.out.println("Successfully written to the file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
