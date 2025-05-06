package com.day8.collection;

import java.util.*;

public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<String> patients = new PriorityQueue<>();
        patients.add("Patient-Critical");
        patients.add("Patient-Normal");
        patients.add("Patient-Urgent");

        System.out.println("Treated Patients (Priority Queue):");
        while (!patients.isEmpty()) {
            System.out.println("- " + patients.poll());
        }
    }
}
