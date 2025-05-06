package com.day8.collection;

import java.util.*;

public class StudentRolls {
    public static void main(String[] args) {
        Set<Integer> rollNumbers = new TreeSet<>();
        rollNumbers.add(102);
        rollNumbers.add(101);
        rollNumbers.add(103);

        System.out.println("Sorted Rolls:");
        for (int roll : rollNumbers) {
            System.out.println("- Roll No: " + roll);
        }
    }
}
