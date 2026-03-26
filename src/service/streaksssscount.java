package service;

import java.io.BufferedReader;
import java.io.FileReader;

public class streaksssscount {

    public void howarethestreaks() {
        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("mood.txt"));
            while (br.readLine() != null) {
                count++;
            }
            br.close();

            System.out.println("\nMood Tracking Streak:");
            System.out.println("You have logged your mood " + count + " times!");

        } catch (Exception e) {
            System.out.println("Start tracking your mood today!");
        }
    }
}