package com.day3;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            result += new StringBuilder(word).reverse().toString() + " ";
        }

        System.out.println("Reversed words: " + result.trim());
    }
}
