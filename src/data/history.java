package data;

import java.io.BufferedReader;
import java.io.FileReader;

public class history {

    public void read() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("mood.txt"));
            String line;

            System.out.println("\n📊 Mood History:");

            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("No history found.");
        }
    }
}