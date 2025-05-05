package com.day2;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        // Declaration and initialization of a single-dimensional array
        int[] marks = {85, 90, 78, 92, 88};

        // Accessing and printing array elements
        System.out.println("Marks of the students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }
}
