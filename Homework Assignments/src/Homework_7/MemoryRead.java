package Homework_7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MemoryRead {

    public static void main(String[] args) throws ClassNotFoundException {

        String fileName = "out.txt";

        try (FileInputStream fs = new FileInputStream(fileName);
                ObjectInputStream os = new ObjectInputStream(fs)) {

            System.out.println((Movie)os.readObject());

        } catch (FileNotFoundException ex) {
            System.out.println("File " + fileName + " was not found.");
        } catch (IOException ex) {
            System.out.println("There was an error reading " + fileName + ".");
        }
    }
}
