package org.example;

public class MoodAnalyser {
    public String message;

    //Parameterised Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    //Default Constructor
    MoodAnalyser() {
    }

    public String analyseMood() {
        if (message.contains("Sad")) {
            System.out.println("SAD");
            return "SAD";
        } else {
            System.out.println("HAPPY");
        }
        return "HAPPY";
    }
}
