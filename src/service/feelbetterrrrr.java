package service;

public class feelbetterrrrr {

    public void Welness(String mood) {
        System.out.println("\nHow to feel better:");

        switch (mood.toLowerCase()) {
            case "sad":
                System.out.println("• Talk to a friend ");
                System.out.println("• Listen to calm music ");
                System.out.println("• Go for a short walk ");
                break;

            case "angry":
                System.out.println("• Take deep breaths ");
                System.out.println("• Try writing your thoughts");
                System.out.println("• Try some exercise ");
                break;

            case "calm":
                System.out.println("• Try meditation ");
                System.out.println("• Take a break from screens ");
                System.out.println("• Drink water and relax ");
                break;

            case "happy":
                System.out.println("• Keep doing what you love ");
                System.out.println("• Share positivity with others ");
                break;

            default:
                System.out.println("• Take care of yourself ");
        }
    }
}