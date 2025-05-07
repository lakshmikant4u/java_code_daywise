package com.day9.java8;

import java.util.Arrays;
import java.util.List;

public class MethodRefDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Neha", "Pooja");
        
        // Lambda style
        names.forEach(name -> System.out.println(name));
        
        // Method reference style
        names.forEach(System.out::println);
    }
}
