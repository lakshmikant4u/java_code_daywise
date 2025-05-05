package com.day2;

import java.util.*;

public class StudentMarksManager {

    // Method to calculate average marks
    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    // Method to find the maximum marks
    public static int findMax(int[] marks) {
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    // Method to find the minimum marks
    public static int findMin(int[] marks) {
        int min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    // Method to search for a student by name
    public static boolean searchStudent(String[] students, String name) {
        for (String student : students) {
            if (student.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();  // consume the newline character

        // Arrays to store student names and marks
        String[] students = new String[numStudents];
        int[] marks = new int[numStudents];

        // Input student names and marks
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = sc.nextLine();
            System.out.print("Enter marks for " + students[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine();  // consume the newline character
        }

        // Display options for the user
        int choice;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Display all students and marks");
            System.out.println("2. Calculate average marks");
            System.out.println("3. Find maximum marks");
            System.out.println("4. Find minimum marks");
            System.out.println("5. Search for a student by name");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline character

            switch (choice) {
                case 1:
                    System.out.println("\nStudent Names and Marks:");
                    for (int i = 0; i < numStudents; i++) {
                        System.out.println(students[i] + " - " + marks[i]);
                    }
                    break;

                case 2:
                    double average = calculateAverage(marks);
                    System.out.println("Average Marks: " + average);
                    break;

                case 3:
                    int maxMarks = findMax(marks);
                    System.out.println("Maximum Marks: " + maxMarks);
                    break;

                case 4:
                    int minMarks = findMin(marks);
                    System.out.println("Minimum Marks: " + minMarks);
                    break;

                case 5:
                    System.out.print("Enter the name of the student to search: ");
                    String searchName = sc.nextLine();
                    if (searchStudent(students, searchName)) {
                        System.out.println(searchName + " found.");
                    } else {
                        System.out.println(searchName + " not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
