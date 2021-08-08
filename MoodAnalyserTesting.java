package org.example;

import org.example.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTesting {
    // Creating an object
    MoodAnalyser checkMood = new MoodAnalyser();

    @Test
    // If message contain SAD then should return SAD
    public void checkIfMessageContainSadShouldReturnSAD() {
        String mood = checkMood.moodAnalyse("I am in Sad Mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    //If message didn't contain SAD then should return HAPPY
    public void checkIfMessageDoesNotContainsSadShouldReturnHAPPY() {
        String mood = checkMood.moodAnalyse("I am in Any Mood");
        Assert.assertEquals("HAPPY", mood);
    }
}