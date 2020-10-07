package com.example.oop;

public class DefaultSpeaker implements Speaker {

    private double size;
    private double  frequency;
    private String type;
    private String brand = "";

    private static double checkSize(double size) {
        if(size > 0.0) {
            return size;
        }
        String error = "Error, Invalid Size: " + size + "\nSize Must Be Positive.";
        throw new IllegalArgumentException(error);
    }

    private static double checkFrequency(double frequency) {
        if(frequency > 0.0) {
            return frequency;
        }
        String error = "Error, Invalid Frequency: " + frequency + "\nFrequency Must Be Positive.";
        throw new IllegalArgumentException(error);
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void setSize(double size) {
        this.size = checkSize(size);
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    @Override
    public void setFrequency(double frequency) {
        this.frequency = checkFrequency(frequency);
    }

    private String checkType(double frequency) {
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
        return type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(double frequency) {
        this.type = checkType(frequency);
    }

    private String checkBrand(String brand) {
        if (brand != null) {
            return brand;
        }
        String error = "Invalid Brand (null).  \nCan't be null.";
        throw new IllegalArgumentException(error);
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = checkBrand(brand);
    }

    public DefaultSpeaker(double size) {
        this.size = checkSize(size);
        this.frequency = 40.56;
        this.type = checkType(frequency);
        this.brand = "";
    }

    public DefaultSpeaker(double size, double frequency) {
        this.size = checkSize(size);
        this.frequency = checkFrequency(frequency);
        this.type = checkType(frequency);
        this.brand = "";
    }
}
