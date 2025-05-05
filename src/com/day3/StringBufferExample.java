package com.day3;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(6, 10, "Spring");

        System.out.println("Final: " + sb); // HelloSpring World
    }
}
