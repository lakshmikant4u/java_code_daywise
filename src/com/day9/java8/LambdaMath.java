package com.day9.java8;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaMath {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation mul = (a, b) -> a * b;

        System.out.println("Sum: " + add.operate(10, 20));
        System.out.println("Product: " + mul.operate(10, 20));
    }
}

