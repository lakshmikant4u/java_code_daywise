package com.day4.polymorphism;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add Int: " + calc.add(10, 20));
        System.out.println("Add Double: " + calc.add(10.5, 20.5));
        System.out.println("Add 3 Ints: " + calc.add(5, 10, 15));
    }
}
