package service;
import utils.date;
import data.mood_repository;

public class featuresformoods {

    private mood_repository repo = new mood_repository();
    private feelbetterrrrr wellnessService = new feelbetterrrrr();
    private givemotivation motivationService = new givemotivation();
    private streaksssscount streakService = new streaksssscount();
    private insight insightService = new insight();
    private dietformood dietService = new dietformood();
    private exerciseformood exerciseService = new exerciseformood();

    public void saveMood(String mood) {
        repo.save(mood + " (" + date.getTodayDate() + ")");
        giveplaylistsuggestions(mood);
        wellnessService.Welness(mood);
        motivationService.Motivationdisplay();
        streakService.howarethestreaks();
        insightService.whataretheinsights();
        dietService.suggestDiet(mood);
        exerciseService.suggestExercise(mood);
    }

    public void giveplaylistsuggestions(String mood) {
        System.out.println("\n🎧 Playlist Suggestion:");

        switch (mood.toLowerCase()) {
            case "happy":
                System.out.println("Try upbeat pop or dance music 🎶");
                break;
            case "sad":
                System.out.println("Try lo-fi or soft songs ");
                break;
            case "angry":
                System.out.println("Try rock or high-energy music ");
                break;
            case "calm":
                System.out.println("Try instrumental or meditation music ");
                break;
            default:
                System.out.println("Play your favorite songs 🎵");
        }
    }
}