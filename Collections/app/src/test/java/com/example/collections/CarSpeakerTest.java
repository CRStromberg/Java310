package com.example.collections;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarSpeakerTest {

    @Test
    public void sizeAndFrequency() {
        double size = 6.55;
        double frequency = 4582.45;
        CarSpeaker instance = new CarSpeaker(size, frequency);
        assertEquals(size, instance.getSize(), 0.0);
        assertEquals(frequency, instance.getFrequency(), 0.0);
    }

    @Test
    public void getSpeakerSize() {
        double size = 14.2;
        CarSpeaker instance = new CarSpeaker(size);
        assertEquals(size, instance.getSpeakerSize(), 0.0);
    }

    @Test
    public void setCarSpeaker() {
        double size = 14.2;
        CarSpeaker instance = new CarSpeaker(size);
        assertEquals(size, instance.getSpeakerSize(), 0.0);
        instance.setCarSpeaker(9.62);
        assertEquals(9.62, instance.getSpeakerSize(), 0.0);
    }

    @Test
    public void setAudible() {
        double size = 3.45;
        boolean isAudible = true;
        CarSpeaker instance = new CarSpeaker(size);
        assertEquals(false, instance.audible());
        instance.setAudible(isAudible);
        assertEquals(true, instance.audible());
    }

    @Test
    public void audible() {
        double size = 3.45;
        boolean isAudible = true;
        CarSpeaker instance = new CarSpeaker(size);
        assertEquals(false, instance.audible());
    }
}