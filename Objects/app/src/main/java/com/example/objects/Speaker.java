package com.example.objects;

public class Speaker {
    public Speaker(double size, double frequency) {
        if(size > 0.0 && frequency > 0.0) {
            this.size = size;
            this.frequency = frequency;
        } else if(size < 0) {
            String error = "Error, Invalid Size: " + size + "\nSize Must Be Positive.";
            throw new IllegalArgumentException(error);
        }else if(frequency < 0) {
            String error = "Error, Invalid Frequency: " + size + "\nFrequency Must Be Positive.";
            throw new IllegalArgumentException(error);
        }
    }

    private double size;
    private double frequency;
    private String type;

    public double getSize() {
        return size;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setType(double frequency) {
        if (frequency >= 3000.0) {
            this.frequency = frequency;
            type = "Tweeter";
        } else if (frequency >= 100.0) {
            this.frequency = frequency;
            type = "Midrange";
        } else {
            this.frequency = frequency;
            type = "Woofer";
        }
    }

    public String getType() {
        return type;
    }

    public boolean audible;

    public boolean isAudible() {
        return frequency >=20;
    }

    public void setAudible(boolean audible)
    {
        this.audible = audible;
    }
}

