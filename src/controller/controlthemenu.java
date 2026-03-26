package controller;

import service.givemotivation;

import java.util.Scanner;

public class controlthemenu {

    public void start() {
        Scanner sc = new Scanner(System.in);
        knowthemood moodController = new knowthemood();

        while (true) {

            System.out.println("\n=== MindTunes ===");
            System.out.println("1. Hey, how's your mood today?");
            System.out.println("2. Are you leaving us?");
            System.out.println("3. Would you like to see how you felt in past?");
            System.out.println("4. Let's grab some motivation");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    moodController.howsthemood();
                    break;

                case 2:
                    System.out.println("Goodbye! Hope to see you soon.");
                    return;
                case 3:
                    moodController.seepast();
                    break;
                case 4:
                    new givemotivation().Motivationdisplay();
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}