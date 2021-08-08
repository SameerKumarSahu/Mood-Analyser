package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTesting {

    @Test
    public void givenSadMessage_WhenAnalysed_MessageShouldReturnSad() {
        MoodAnalyser checkMood = new MoodAnalyser("I am in Sad Mood");
        String mood = checkMood.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenAnyMoodMessage_WhenAnalysed_MessageShouldReturnHappy() {
        MoodAnalyser checkMood = new MoodAnalyser("I am in Any Mood");
        String mood = checkMood.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

 }