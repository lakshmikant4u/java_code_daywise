package com.day9.java8;

import java.util.*;
import java.util.stream.*;

public class StudentFilter {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(45, 82, 91, 68, 76);

        System.out.println("Top Scorers:");
        marks.stream()
            .filter(m -> m > 75)
            .forEach(System.out::println);
    }
}
