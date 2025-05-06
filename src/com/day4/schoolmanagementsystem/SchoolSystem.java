package com.day4.schoolmanagementsystem;

abstract class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }

    public abstract void showDetails();
}

class Student extends Person {
    private String standard;
    private String schoolName;

    public Student(String name, int age, String city, String standard, String schoolName) {
        super(name, age, city);
        this.standard = standard;
        this.schoolName = schoolName;
    }

    @Override
    public void showDetails() {
        System.out.println("👦 Student Name: " + getName());
        System.out.println("🏫 School: " + schoolName);
        System.out.println("🎓 Class: " + standard);
        System.out.println("🎂 Age: " + getAge());
        System.out.println("📍 City: " + getCity());
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Aarav Sharma", 13, "Delhi", "8th Standard", "Delhi Public School");
        s1.showDetails();
    }
}

