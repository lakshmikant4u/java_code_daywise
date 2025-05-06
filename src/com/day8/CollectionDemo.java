package com.day8;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");

        // Iterator
        System.out.println("Using Iterator:");
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ListIterator
        System.out.println("\nUsing ListIterator (forward & backward):");
        ListIterator<String> listIt = cities.listIterator();
        while (listIt.hasNext()) {
            System.out.println("Forward: " + listIt.next());
        }
        while (listIt.hasPrevious()) {
            System.out.println("Backward: " + listIt.previous());
        }

        // Enumeration (Vector only)
        Vector<String> vector = new Vector<>(cities);
        Enumeration<String> enumeration = vector.elements();
        System.out.println("\nUsing Enumeration:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
