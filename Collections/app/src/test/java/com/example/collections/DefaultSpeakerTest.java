package com.example.collections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefaultSpeakerTest {

    @Test
    public void getSize() {
        double size = 25.4;
        double frequency = 1501.5;
        DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
        assertEquals(size, instance.getSize(), 0.0);
    }

    @Test (expected = IllegalArgumentException.class)
    public  void getBadSize() {
        double invalidSize = -1.4;
        double frequency = 100;
        String error = "Error, Invalid Size: " + invalidSize + "\nSize Must Be Positive.";
        try {
            homeSpeaker instance = new homeSpeaker(invalidSize, frequency);
        } catch (IllegalArgumentException ex) {
            assertEquals(error, ex.getMessage());
            throw ex;
        }
    }

    @Test
    public void setSize() {
        double size = 25.4;
        double frequency = 1501.5;
        DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
        double newSize = 6.5;
        instance.setSize(newSize);
        assertEquals(newSize,instance.getSize(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidSetSize() {
        double size = 6.51;
        double invalidSize = -1.4;
        double frequency = 100;
        String error = "Error, Invalid Size: " + invalidSize + "\nSize Must Be Positive.";
        try {
            DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
            instance.setSize(invalidSize);
        } catch (IllegalArgumentException ex) {
            assertEquals(error, ex.getMessage());
            throw ex;
        }
    }

    @Test
    public void getFrequency() {
        double size = 25.4;
        double frequency = 1501.5;
        DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
        assertEquals(frequency, instance.getFrequency(), 0.0);
    }

    @Test
    public void setFrequency() {
        double size = 25.4;
        double frequency = 1501.5;
        DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
        double newFrequency = 300.91;
        instance.setFrequency(newFrequency);
        assertEquals(newFrequency, instance.getFrequency(), 0.0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void SetBadFrequency() {
        double invalidSize = 1.4;
        double frequency= 34.88;
        double badFrequency = -100;
        String error = "Error, Invalid Frequency: " + badFrequency + "\nFrequency Must Be Positive.";
        try {
            DefaultSpeaker instance = new DefaultSpeaker(invalidSize, frequency);
            instance.setFrequency(badFrequency);
        } catch (IllegalArgumentException ex) {
            assertEquals(error, ex.getMessage());
            throw ex;
        }
    }

    @Test
    public void GetType() {
        double size = 6.5;
        double frequency = 87.32;
        DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
        assertEquals(null, instance.getType(), "Woofer");
    }

    @Test
    public void setTypeTweeter() {
        double size = 6.5;
        double frequency = 10900;
        String type = "Tweeter";
        DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
        instance.setType(frequency);
        assertEquals(type, instance.getType(), "Tweeter");
    }

    @Test
    public void setTypeMidrange() {
        double size = 6.5;
        double frequency = 900.88;
        String type = "Midrange";
        DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
        instance.setType(frequency);
        assertEquals(type, instance.getType(), "Midrange");
    }

    @Test
    public void setTypeWoofer() {
        double size = 6.5;
        double frequency = 87.32;
        String type = "Woofer";
        DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
        instance.setType(frequency);
        assertEquals(type, instance.getType(), "Woofer");
    }

    @Test
    public void getBrand() {
        double size = 25.4;
        double frequency = 1501.5;
        DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
        assertEquals("Defualt brand is empty", instance.getBrand(), "");
    }

    @Test
    public void setBrand() {
        double size = 25.4;
        double frequency = 1501.5;
        String brand = "Dayton";
        DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
        instance.setBrand(brand);
        assertEquals("Set brand to dayton", instance.getBrand(), brand);
    }

    @Test (expected = IllegalArgumentException.class)
    public void SetBadBrand() {
        double size = 1.4;
        double frequency= 34.88;
        String brand = "Dayton";
        String badBrand = null;
        String error = "Invalid Brand (null).  \nCan't be null.";
        try {
            DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
            instance.setBrand(badBrand);
        } catch (IllegalArgumentException ex) {
            assertEquals(error, ex.getMessage());
            throw ex;
        }
    }
}