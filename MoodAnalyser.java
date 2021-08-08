package org.example;

public class MoodAnalyser {
    public String moodAnalyse(String message) {
        if (message.contains("Sad")) {
            System.out.println("SAD");
            return "SAD";
        } else {
            System.out.println("HAPPY");
        }
        return "HAPPY";
    }
}