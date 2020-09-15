package com.example.objects;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpeakerTest {

    @Test
    public void getSize() {
        double size = 6.5;
        Speaker instance = new Speaker(size);
        assertEquals(size, instance.getSize(), 6.5);
    }

    @Test
    public void getFrequency() {
        double frequency = 56.75;
        Speaker instance = new Speaker(frequency);
        assertEquals(frequency, instance.getFrequency(), 56.75);
    }

    @Test
    public void getType() {
        Speaker instance = new Speaker(13.0);
        assertEquals(null, instance.getType());
    }

    @Test
    public void audibleTrue() {
        double frequency = 674.87;
        Speaker instance = new Speaker(frequency);
        instance.setType(frequency);
        assertEquals(true, instance.audible());
    }


    @Test
    public void setType() {
        double frequency = 56.75;
        Speaker instance = new Speaker(frequency);
        instance.setType(frequency);
        assertEquals("Woofer", instance.getType());
    }
}