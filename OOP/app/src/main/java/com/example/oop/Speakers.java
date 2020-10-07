package com.example.oop;

public interface Speakers {
    public double getFrequency();
    public double getSize();
    public String getType();
    public void setFrequency(double frequency);
    public void setSize(double size);
    public void setType(double frequency);

    default boolean isAudible() {
        return getFrequency() >= 20;
    }

    String getBrand();
    void setBrand(String brand);
}
