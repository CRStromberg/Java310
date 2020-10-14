package com.example.collections;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ManufactureTest {

    @Test
    public void getAmpVoltage() {
        Manufacture Dayton = new Manufacture(15.0, "Dayton", 80.45);
        assertEquals(Dayton.getAmpVoltage(), 15.0, 0.0);
    }

    @Test
    public void getLocation() {
        Manufacture Dayton = new Manufacture(15.0, "Dayton", 80.45);
        assertEquals(Dayton.getBrand(), "Dayton");
    }

    @Test
    public void getResistance() {
        Manufacture Dayton = new Manufacture(15.0, "Dayton", 80.45);
        assertEquals(Dayton.getResistance(), 80.45, 0.0);
    }

    @Test
    public void checkAmpVoltage() {
        String brand = "Dayton";
        double resistance = 80.45;
        double volt = 15.0;
        Manufacture Dayton = new Manufacture(volt, brand, resistance);
        assertEquals(Dayton.checkAmpVoltage(volt), 15.0, 0.0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void checkBadAmpVoltage() {
        String brand = "Dayton";
        double resistance = 80.45;
        double volt = 15.0;
        double badVolt = -12.58;
        String error = "Error, Invalid Voltage: " + badVolt + "\nVoltage Must Be Positive.";
        try {
            Manufacture Dayton = new Manufacture(volt, brand, resistance);
           Dayton.checkAmpVoltage(badVolt);
        } catch (IllegalArgumentException ex) {
            assertEquals(error, ex.getMessage());
            throw ex;
        }
    }

    @Test
    public void checkResistance() {
        String brand = "Dayton";
        double resistance = 80.45;
        double volt = 15.0;
        Manufacture Dayton = new Manufacture(volt, brand, resistance);
        assertEquals(Dayton.checkResistance(resistance), 80.45, 0.0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void checkBadResistance() {
        String brand = "Dayton";
        double resistance = 80.45;
        double volt = 15.0;
        double badRes = -78.63;
        String error = "Error, Invalid Resistance: " + badRes + "\nResistance Must Be Positive.";
        try {
            Manufacture Dayton = new Manufacture(volt, brand, resistance);
            Dayton.checkResistance(badRes);
        } catch (IllegalArgumentException ex) {
            assertEquals(error, ex.getMessage());
            throw ex;
        }
    }

    @Test
    public void getWatts() {
        String brand = "Dayton";
        double resistance = 2.25;
        double volt = 15.0;
        Manufacture Dayton = new Manufacture(volt, brand, resistance);
        assertEquals(Dayton.getWatts(volt, resistance), 100, 0.0);
    }

    @Test
    public void compareTo() {
        ArrayList<Manufacture> a = new ArrayList<Manufacture>();
        a.add(new Manufacture(14.58, "Dayton", 0.52));
        a.add(new Manufacture(12.35, "Dayton", 1.98));
        a.add(new Manufacture(9.56, "Sun", 4.35));
        a.add(new Manufacture(11.98, "Sun", 4.35));

        for (int i=0; i<a.size(); ++i) {
            assertTrue(a.get(i).compareTo(a.get(i)) == 0);
            for (int j=i+1; j<a.size(); ++j) {
                assertTrue(a.get(i).compareTo(a.get(j)) < 0);
                assertTrue(a.get(j).compareTo(a.get(i)) > 0);
            }
        }
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void approximatePowerDiff() {
    }

    @Test
    public void addManufactureByPower() {
    }
}