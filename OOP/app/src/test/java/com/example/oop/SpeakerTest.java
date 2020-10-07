package com.example.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpeakerTest {

    @Test(expected = IllegalArgumentException.class)
    public void invalidSize() {
        double invalidSize = -1.4;
        double frequency = 100;
        String error = "Error, Invalid Size: " + invalidSize + "\nSize Must Be Positive.";
        try {
            Speaker instance = new Speaker(invalidSize, frequency);
        } catch (IllegalArgumentException ex) {
            assertEquals(error, ex.getMessage());
            throw ex;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidFrequency() {
        double invalidSize = 1.4;
        double frequency = -100;
        String error = "Error, Invalid Frequency: " + invalidSize + "\nFrequency Must Be Positive.";
        try {
            Speaker instance = new Speaker(invalidSize, frequency);
        } catch (IllegalArgumentException ex) {
            assertEquals(error, ex.getMessage());
            throw ex;
        }
    }

    @Test
    public void GetSize() {
        double size = 6.5;
        double frequency = 200;
        Speaker instance = new Speaker(size, frequency);
        assertEquals(size, instance.getSize(), 6.5);
    }

    @Test
    public void GetFrequency() {
        double size = 6.5;
        double frequency = 200;
        Speaker instance = new Speaker(size, frequency);
        assertEquals(frequency, instance.getFrequency(), 200);
    }

    @Test
    public void setTypeTweeter() {
        double size = 6.5;
        double frequency = 10900;
        String type = "Tweeter";
        Speaker instance = new Speaker(size, frequency);
        instance.setType(frequency);
        assertEquals(type, instance.getType(), "Tweeter");
    }

    @Test
    public void setTypeMidrange() {
        double size = 6.5;
        double frequency = 900.88;
        String type = "Midrange";
        Speaker instance = new Speaker(size, frequency);
        instance.setType(frequency);
        assertEquals(type, instance.getType(), "Midrange");
    }

    @Test
    public void setTypeWoofer() {
        double size = 6.5;
        double frequency = 87.32;
        String type = "Woofer";
        Speaker instance = new Speaker(size, frequency);
        instance.setType(frequency);
        assertEquals(type, instance.getType(), "Woofer");
    }

    @Test
    public void GetType() {
        double size = 6.5;
        double frequency = 87.32;
        String type = "Woofer";
        Speaker instance = new Speaker(size, frequency);
        assertEquals(null, instance.getType(), null);
    }

    @Test
    public void isAudibleTrue() {
        double size = 32.7;
        double frequency = 298.43;
        Speaker instance = new Speaker(size, frequency);
        assertEquals(true, instance.isAudible());
    }

    @Test
    public void isAudibleFalse() {
        double size = 0.75;
        double frequency = 9.45;
        Speaker instance = new Speaker(size, frequency);
        assertEquals(false, instance.isAudible());
    }

    @Test
    public void setAudible() {
        double size = 6.5;
        double frequency = 87.32;
        Speaker instance = new Speaker(size, frequency);
        instance.setAudible(instance.isAudible());
        assertEquals(true, instance.isAudible());
        instance.setType(frequency);
    }

}