package Homework_7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MemoryDump {

    public static void main(String[] args) throws IOException {
    	String [] actors = {"Daniel Day Lewis","Sally Field"};

        String fileName = "out.txt";

        try (FileOutputStream fs = new FileOutputStream(fileName);
                ObjectOutputStream os = new ObjectOutputStream(fs)) {

            Movie s = new Movie("Lincoln","Steven Spielberg",actors,"01/01/2012");
            
            os.writeObject(s);
            
        } catch (FileNotFoundException ex) {
            System.out.println("File " + fileName + " was not found.");
        } 

    }
}
