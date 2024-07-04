package org.example.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new IntegerCalculator();
        System.out.println("Integer Calculator:");
        System.out.println("Add: " + intCalc.add(5, 3));
        System.out.println("Subtract: " + intCalc.sub(5, 3));
        System.out.println("Multiply: " + intCalc.multi(5, 3));
        System.out.println("Divide: " + intCalc.div(5, 3));

        Calculator<Double> doubleCalc = new DoubleCalculator();
        System.out.println("\nDouble Calculator:");
        System.out.println("Add: " + doubleCalc.add(5.0, 3.0));
        System.out.println("Subtract: " + doubleCalc.sub(5.0, 3.0));
        System.out.println("Multiply: " + doubleCalc.multi(5.0, 3.0));
        System.out.println("Divide: " + doubleCalc.div(5.0, 3.0));

        Calculator<Long> longCalc = new LongCalculator();
        System.out.println("\nLong Calculator:");
        System.out.println("Add: " + longCalc.add(5L, 3L));
        System.out.println("Subtract: " + longCalc.sub(5L, 3L));
        System.out.println("Multiply: " + longCalc.multi(5L, 3L));
        System.out.println("Divide: " + longCalc.div(5L, 3L));
    }
}
