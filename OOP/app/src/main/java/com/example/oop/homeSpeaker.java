package com.example.oop;

public class homeSpeaker implements Speaker {
    public homeSpeaker(double size, double frequency) {
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
    private String brand;

    public double getSize() {
        return size;
    }

    @Override
    public void setSize(double size) {
        if(size > 0.0) {
            this.size = size;
        } else {
            String error = "Error, Invalid Size: " + size + "\nSize Must Be Positive.";
            throw new IllegalArgumentException(error);
        }

    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public void setFrequency(double frequency) {
        if(frequency > 0.0) {
            this.frequency = frequency;
        } else {
            String error = "Error, Invalid Frequency: " + frequency + "\nFrequency Must Be Positive.";
            throw new IllegalArgumentException(error);
        }

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

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
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

