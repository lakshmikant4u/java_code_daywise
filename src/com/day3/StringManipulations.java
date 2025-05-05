package com.day3;

public class StringManipulations {
    public static void main(String[] args) {
        String message = "  Hello Java World  ";

        System.out.println("Original: '" + message + "'");
        System.out.println("Trimmed: '" + message.trim() + "'");
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());
        System.out.println("Length: " + message.length());
        System.out.println("First char: " + message.charAt(0));
        System.out.println("Substring (6-10): " + message.substring(6, 10));
        System.out.println("Replace 'Java' with 'Spring': " + message.replace("Java", "Spring"));
        System.out.println("Contains 'World'? " + message.contains("World"));
    }
}
