package com.example.collections;

public interface Speaker {
    double getSize();
    void setSize(double size);
    double getFrequency();
    void setFrequency(double frequency);
    String getType();
    void setType(double frequency);
    String getBrand();
    void setBrand(String brand);

    default boolean isAudible() {
        return getFrequency() >= 20.0;
    }

}
