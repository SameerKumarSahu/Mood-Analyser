package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTesting {

    @Test
    //If message contains SAD then it will show SAD
    public void givenSadMessage_WhenAnalysed_MessageShouldReturnSad() {
        MoodAnalyser checkMood = new MoodAnalyser("I am in Sad Mood");
        String mood = checkMood.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    //If message doesn't contains SAD then it will show HAPPY
    public void givenAnyMoodMessage_WhenAnalysed_MessageShouldReturnHappy() {
        MoodAnalyser checkMood = new MoodAnalyser("I am in Any Mood");
        String mood = checkMood.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    //IF Null Mood or no message then it should return HAPPY
    public void givenMessage_whennull_ShouldReturnHappy() {
        MoodAnalyser checkMood = new MoodAnalyser(null);
        String mood = checkMood.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}