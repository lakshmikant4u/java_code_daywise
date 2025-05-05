package com.day3;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1.concat(" World");

        System.out.println("Original: " + s1);   // Hello
        System.out.println("Modified: " + s2);   // Hello World
    }
}
