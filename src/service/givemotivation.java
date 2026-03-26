package service;

import java.io.BufferedReader;
import java.io.FileReader;

public class givemotivation {

    public void Motivationdisplay() {
        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("mood.txt"));
            while (br.readLine() != null) {
                count++;
            }
            br.close();

        } catch (Exception e) {
            System.out.println("Start tracking your mood today!");
            return;
        }

        System.out.println("\n Motivation:");

        if (count >= 5) {
            System.out.println("You’ve been consistent! Keep going ");
        } else {
            System.out.println("Good start! You're trying your best ");
        }
    }
}