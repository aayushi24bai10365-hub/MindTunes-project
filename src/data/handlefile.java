package data;

import java.io.FileWriter;
import java.io.IOException;

public class handlefile {

    public void write(String mood) {
        try {
            FileWriter fw = new FileWriter("mood.txt", true);
            fw.write(mood + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving mood");
        }
    }
}