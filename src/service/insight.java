package service;

import java.io.BufferedReader;
import java.io.FileReader;

public class insight {

    public void whataretheinsights() {
        int happy = 0, sad = 0, angry = 0, calm = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("mood.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("happy")) happy++;
                else if (line.contains("sad")) sad++;
                else if (line.contains("angry")) angry++;
                else if (line.contains("calm")) calm++;
            }

            br.close();

            System.out.println("\n Mood Insight:");

            if (sad > happy) {
                System.out.println("You've been feeling low lately ");
            } else if (happy > sad) {
                System.out.println("You're mostly feeling positive ");
            } else {
                System.out.println("Your mood is balanced ");
            }

        } catch (Exception e) {
            System.out.println("No data available.");
        }
    }
}