package com.day2;

import java.util.*;

public class StudentMarksReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students and subjects
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        // Create 2D array
        int[][] marks = new int[students][subjects];
        String[] names = new String[students];

        // Input student names and marks
        for (int i = 0; i < students; i++) {
            sc.nextLine(); // consume newline
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Display report
        System.out.println("\n==== Student Marks Report ====");
        for (int i = 0; i < students; i++) {
            System.out.println("Student: " + names[i]);
            int total = 0;
            for (int j = 0; j < subjects; j++) {
                System.out.println("Subject " + (j + 1) + ": " + marks[i][j]);
                total += marks[i][j];
            }
            double average = (double) total / subjects;
            System.out.println("Total: " + total + " | Average: " + average);
            System.out.println("------------------------------");
        }

        sc.close();
    }
}

