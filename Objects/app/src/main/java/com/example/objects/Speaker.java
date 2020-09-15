package com.example.objects;

public class Speaker {
    public Speaker(double size) {
        if (size > 0.0) {
            this.size = size;
        } else {
            String error = size + ": Size cannot be negative.";
            throw new IllegalArgumentException(error);
        }
    }

    //Property
    private double size;
    //Method (getter)
    public double getSize() {
        return size;
    }
    //Property
    //For sake of simplicity I'm just using the top end of frequency response
    private double frequency;
    //Method (getter)
    public double getFrequency() {
        return frequency;
    }

    //Property
    private String type;
    //Method (getter)
    public String getType() {
        return type;
    }

    public boolean audible() {
        return frequency >= 20.0;
    }

    public void setType(double frequency) {
        if (frequency >= 3000.0 && size > 0.0) {
            this.frequency = frequency;
            type = "Tweeter";
        } else if (frequency >= 100.0 && size > 0.0) {
            this.frequency = frequency;
            type = "Midrange";
        } else if (frequency >= 20.0 && size > 0.0) {
            this.frequency = frequency;
            type = "Woofer";
        } else {
            String error = frequency + ": Not a valid frequency.";
            throw new IllegalArgumentException(error);
        }
    }

}
