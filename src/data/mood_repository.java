package data;

public class mood_repository {

    private handlefile fileHandler = new handlefile();

    public void save(String mood) {
        fileHandler.write(mood);
    }
}