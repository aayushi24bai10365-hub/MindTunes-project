package service;

public class exerciseformood {

    public void suggestExercise(String mood) {
        System.out.println("\n Exercise Suggestion:");

        switch (mood.toLowerCase()) {
            case "sad":
                System.out.println("• Go for a walk ");
                System.out.println("• Light stretching ");
                break;

            case "angry":
                System.out.println("• Try intense workout ");
                System.out.println("• Deep breathing ");
                break;

            case "calm":
                System.out.println("• Meditation ");
                System.out.println("• Yoga");
                break;

            case "happy":
                System.out.println("• Dance or play sports ");
                break;

            default:
                System.out.println("• Stay active daily ");
        }
    }
}
