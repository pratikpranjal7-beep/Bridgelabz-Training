package com.gla;

public class SensorData {
    public static void logData(Double value) {
        if (value == null) {
            System.out.println("No data");
        } else {
            System.out.println("Value: " + value);
        }
    }

    public static void main(String[] args) {
        double primitive = 25.5;
        Double wrapper = 30.2;

        logData(primitive);
        logData(wrapper);
    }
}
