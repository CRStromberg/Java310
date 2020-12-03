package com.example.collections;

import java.util.Collection;

public class Manufacture implements Comparable <Manufacture> {
    private double ampVoltage;
    private double resistance;
    private String brand;

    public double getAmpVoltage() {
        return ampVoltage;
    }

    public String getBrand() {
        return brand;
    }

    public double getResistance() {
        return resistance;
    }

    public Manufacture(double ampVoltage, String brand, double resistance) {
        this.brand = brand;
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
        i = this.brand.compareTo(another.brand);

        if(i != 0) {
            return i;
        }
        i = (this.resistance < another.resistance) ? -1 : (this.resistance > another.resistance) ? 1 : 0;
        if(i != 0) {
            return i;
        }
        i = (this.ampVoltage < another.ampVoltage) ? -1 : (this.ampVoltage > another.ampVoltage) ? 1 : 0;
        if(i != 0) {
            return i;
        }
        return 0;
    }

    @Override
    public boolean equals(Object to) {
        return compareTo((Manufacture) to) == 0;
    }

    @Override
    public int hashCode() {
        return 3*brand.hashCode()+ 43*Double.hashCode(this.resistance)+ 7*Double.hashCode(this.ampVoltage);
    }

    public double approximatePowerDiff(Manufacture to) {
        double powOne = getWatts(ampVoltage, resistance);
        double powTwo = getWatts(to.ampVoltage, to.resistance);

        if(powOne > powTwo) {
            return powOne - powTwo;
        }else {
            return powTwo - powOne;
        }
    }

    public static void addManufactureByPower(Collection<Manufacture> results, Manufacture center, double watts, Collection<Manufacture> search) {
        for(Manufacture at : search) {
            if(center.approximatePowerDiff(at) <= watts) {
                results.add(at);
            }
        }
    }

}
