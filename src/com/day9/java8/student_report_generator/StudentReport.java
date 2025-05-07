package com.day9.java8.student_report_generator;

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks + " marks";
    }
}

public class StudentReport {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Amit", 92),
            new Student("Neha", 88),
            new Student("Ravi", 76),
            new Student("Pooja", 64),
            new Student("Sanjay", 85)
        );

        System.out.println("🏅 Top Scorers (> 80):");
        students.stream()
                .filter(s -> s.marks > 80)
                .forEach(System.out::println);

        System.out.println("\n📊 Sorted by Name:");
        students.stream()
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);

        System.out.println("\n📈 Average Score:");
        double avg = students.stream()
                .mapToInt(s -> s.marks)
                .average()
                .orElse(0.0);
        System.out.println("Average Marks: " + avg);
    }
}
