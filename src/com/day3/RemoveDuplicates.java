package com.day3;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String result = "";

        for (char c : input.toCharArray()) {
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}
