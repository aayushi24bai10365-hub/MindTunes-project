package service;

public class dietformood {

    public void suggestDiet(String mood) {
        System.out.println("\n Diet Suggestion:");

        switch (mood.toLowerCase()) {
            case "sad":
                System.out.println("• Eat fruits like banana ");
                System.out.println("• Dark chocolate can help mood ");
                break;

            case "angry":
                System.out.println("• Drink water ");
                System.out.println("• Avoid caffeine ");
                break;

            case "calm":
                System.out.println("• Eat light meals ");
                System.out.println("• Herbal tea is helpful");
                break;

            case "happy":
                System.out.println("• Maintain balanced diet ");
                break;

            default:
                System.out.println("• Eat healthy and stay hydrated ");
        }
    }
}
