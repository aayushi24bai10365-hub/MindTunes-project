package controller;

import service.featuresformoods;
import java.util.Scanner;

public class knowthemood {

    private featuresformoods featuresformoods = new featuresformoods();

    public void howsthemood() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your mood (happy/sad/angry/calm): ");
        String mood = sc.nextLine();

        featuresformoods.saveMood(mood);
    }
    public void seepast() {
        System.out.println("\nMood History:");

        try {
            java.io.BufferedReader br = new java.io.BufferedReader(
                    new java.io.FileReader("mood.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("No history found.");
        }
    }
}