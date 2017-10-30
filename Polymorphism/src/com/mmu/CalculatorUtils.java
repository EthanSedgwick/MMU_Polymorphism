package com.mmu;

public class CalculatorUtils {

    public CalculatorUtils() {
    }

    public static double add(double a, double b) {
        double output = a + b;
        return output;
    }

    public static double add(double a, double b, double c) {
        double output = a + b + c;
        return output;
    }

    public static double subtract(double a, double b) {
        double output = a - b;
        return output;
    }

    public static double divide(double a, double b) {
        double output = a / b;
        return output;
    }

    public static double multiply(double a, double b) {
        double output = a * b;
        return output;
    }

    public static double multiply(double a, double b, double c) {
        double output = a * b * c;
        return output;
    }
}
