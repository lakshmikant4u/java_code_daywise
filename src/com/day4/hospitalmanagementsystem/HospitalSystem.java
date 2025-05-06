package com.day4.hospitalmanagementsystem;

abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract void showDetails();
}

class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void showDetails() {
        System.out.println("👨‍⚕️ Doctor: " + getName() + ", Age: " + getAge());
        System.out.println("Specialization: " + specialization);
    }
}

class Patient extends Person {
    private String disease;
    private int roomNo;

    public Patient(String name, int age, String disease, int roomNo) {
        super(name, age);
        this.disease = disease;
        this.roomNo = roomNo;
    }

    // Method Overloading
    public void admit() {
        System.out.println(getName() + " has been admitted.");
    }

    public void admit(String wardType) {
        System.out.println(getName() + " has been admitted to " + wardType + " ward.");
    }

    @Override
    public void showDetails() {
        System.out.println("🧑‍🦱 Patient: " + getName() + ", Age: " + getAge());
        System.out.println("Disease: " + disease + ", Room No: " + roomNo);
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Ravi Kumar", 45, "Cardiology");
        d.showDetails();
        System.out.println();

        Patient p = new Patient("Meena Joshi", 30, "Asthma", 102);
        p.showDetails();
        p.admit();
        p.admit("Private");
    }
}
