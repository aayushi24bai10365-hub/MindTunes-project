package service;

public class musiccccplaylist {

    public void suggestsomething(String mood) {
        System.out.println("\nPlaylist Suggestion:");

        switch (mood.toLowerCase()) {
            case "happy":
                System.out.println("Try upbeat pop or dance music ");
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
                System.out.println("Play your favorite songs ");
        }
    }
}