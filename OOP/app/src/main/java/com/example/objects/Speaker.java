package com.example.objects;

public interface Speaker {
    double getSize();
    void setSize(double size);

    double getFrequency();
    void setFrequency();

    default boolean audible() {
        return getFrequency() <= 20.0;
    }

    String getType();
    void setType(double frequency);
}

