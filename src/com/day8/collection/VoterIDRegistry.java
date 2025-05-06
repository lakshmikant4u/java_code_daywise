package com.day8.collection;

import java.util.*;

public class VoterIDRegistry {
    public static void main(String[] args) {
        Set<String> voterIDs = new HashSet<>();
        voterIDs.add("IND12345");
        voterIDs.add("IND67890");
        voterIDs.add("IND12345"); // duplicate ignored

        System.out.println("Registered Voter IDs:");
        for (String id : voterIDs) {
            System.out.println("- " + id);
        }
    }
}
