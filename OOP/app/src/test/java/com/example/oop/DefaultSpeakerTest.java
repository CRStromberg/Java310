package com.example.oop;

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

    @Test
    public void setSize() {
        double size = 25.4;
        double frequency = 1501.5;
        DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
        double newSize = 6.5;
        instance.setSize(newSize);
        assertEquals(newSize,instance.getSize(), 0.0);
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

    @Test
    public void GetType() {
        double size = 6.5;
        double frequency = 87.32;
        DefaultSpeaker instance = new DefaultSpeaker(size, frequency);
        assertEquals(null, instance.getType(), null);
    }

    @Test
    public void setType() {
    }

    @Test
    public void getBrand() {
    }

    @Test
    public void setBrand() {
    }
}