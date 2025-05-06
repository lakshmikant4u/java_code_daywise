package com.day8.collection;

import java.util.*;

public class AppointmentScheduler {
    public static void main(String[] args) {
        TreeMap<String, String> appointments = new TreeMap<>();
        appointments.put("2025-05-10", "Dentist - Dr. Kapoor");
        appointments.put("2025-05-07", "Eye Checkup - Dr. Nair");

        System.out.println("Upcoming Appointments:");
        appointments.forEach((date, detail) ->
            System.out.println(date + ": " + detail)
        );
    }
}
