package com.example.objects;

public class Speakers {
    private String Type;
    private int lowFreq;
    private  int highFreq;

    public int getHighFreq() {
        return highFreq;
    }

    public int getLowFreq() {
        return lowFreq;
    }

    public String setType() {
        if (highFreq <= 500) {
            return "Subwoofer";
        } else if (lowFreq >= 3000) {
            return "Tweeter";
        } else if (lowFreq > 500 && highFreq < 3000)
        {
            return "Woofer";
        } else {
            return "Full Range";
        }
    }

}

