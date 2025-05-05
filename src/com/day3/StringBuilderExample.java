package com.day3;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Data");
        sb.append("Base");
        sb.reverse();

        System.out.println("Reversed: " + sb); // esaBataD
    }
}
