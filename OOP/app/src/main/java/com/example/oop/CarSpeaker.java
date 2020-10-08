package com.example.oop;

public class CarSpeaker extends DefaultSpeaker{

    private boolean audible = false;

    public CarSpeaker(double size){
        super(size);
    }

    public CarSpeaker(double size, double frequency) {
        super(size, frequency);
    }

    public double getSpeakerSize() {
        return getSize();
    }

    public void setCarSpeaker(double speakerSize) {
        setSize(speakerSize);
    }

    public void setAudible(boolean audible) {
        this.audible = audible;
    }
    public boolean audible() {
        return audible;
    }
}
