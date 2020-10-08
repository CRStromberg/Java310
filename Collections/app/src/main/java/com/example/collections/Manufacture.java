package com.example.collections;

public class Manufacture implements Comparable <Manufacture> {
    private double ampVoltage;
    private double resistance;
    private String location;

    public double getAmpVoltage() {
        return ampVoltage;
    }

    public String getLocation() {
        return location;
    }

    public double getResistance() {
        return resistance;
    }

    public Manufacture(double ampVoltage, String location, double resistance) {
        this.location = location;
        this.resistance = checkResistance(resistance);
        this.ampVoltage = checkAmpVoltage(ampVoltage);

    }

    public double checkAmpVoltage(double ampVoltage) {
        if (ampVoltage > 0) {
            return ampVoltage;
        } else {
            String error = "Error, Invalid Voltage: " + ampVoltage + "\nVoltage Must Be Positive.";
            throw new IllegalArgumentException(error);
        }
    }

    public double checkResistance(double resistance) {
        if (resistance > 0) {
            return resistance;
        } else {
            String error = "Error, Invalid Resistance: " + resistance + "\nResistance Must Be Positive.";
            throw new IllegalArgumentException(error);
        }
    }

    public double getWatts(double ampVoltage, double resistance) {
        //p=v^2/r gets watts
        return ((Math.pow(ampVoltage, 2)) / resistance);
    }

    @Override
    public int compareTo(Manufacture another) {
        int i;
        i = this.location.compareTo(another.location);

        if(i != 0) {
            return i;
        }
        i = (this.ampVoltage < another.ampVoltage) ? -1 : (this.ampVoltage > another.ampVoltage) ? 1 : 0;
        if(i != 0) {
            return i;
        }
        i = (this.resistance < another.resistance) ? -1 : (this.resistance > another.resistance) ? 1 : 0;
        if(i != 0) {
            return i;
        }
        return 0;
    }

    @Override
    public int hashCode() {
        return 3*location.hashCode()+ 43*Double.hashCode(this.ampVoltage)+ 7*Double.hashCode(this.resistance);
    }

    public boolean equal(Object to) {
        return compareTo((Manufacture) to) == 0;
    }


}
