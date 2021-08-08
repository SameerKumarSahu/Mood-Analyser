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
        try {
            if (message.contains("Sad")) {
                System.out.println("SAD");
                return "SAD";
            } else {
                System.out.println("HAPPY");
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("HAPPY");
            return "HAPPY";
        }
    }
}