package utils;

import java.time.LocalDate;

public class date {
    public static String getTodayDate() {
        return LocalDate.now().toString();
    }
}