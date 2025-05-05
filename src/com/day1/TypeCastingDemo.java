package com.day1;

public class TypeCastingDemo {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // Widening

        double x = 9.78;
        int y = (int) x; // Narrowing

        System.out.println("Widening: " + b);
        System.out.println("Narrowing: " + y);
    }
}
