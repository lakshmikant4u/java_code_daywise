package com.day2;

import java.util.*;

public class EmployeeSkillsTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of employees
        System.out.print("Enter number of employees: ");
        int numEmployees = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] employeeNames = new String[numEmployees];
        String[][] skills = new String[numEmployees][];

        // Input employee names and skills
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            employeeNames[i] = sc.nextLine();

            System.out.print("How many skills does " + employeeNames[i] + " have? ");
            int skillCount = sc.nextInt();
            sc.nextLine(); // consume newline

            skills[i] = new String[skillCount];
            for (int j = 0; j < skillCount; j++) {
                System.out.print("Enter skill " + (j + 1) + ": ");
                skills[i][j] = sc.nextLine();
            }
        }

        // Display all employee skills
        System.out.println("\n==== Employee Skill Matrix ====");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee: " + employeeNames[i]);
            System.out.println("Skills: " + String.join(", ", skills[i]));
            System.out.println("------------------------------");
        }

        sc.close();
    }
}
