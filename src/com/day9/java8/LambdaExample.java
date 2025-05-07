package com.day9.java8;

@FunctionalInterface
interface GreetService {
    void greet(String name);
}

public class LambdaExample {
    public static void main(String[] args) {
        GreetService greet = name -> System.out.println("Namaste, " + name + "!");
        greet.greet("Ravi");
    }
}
