package com.day7;

class A {
    public synchronized void methodA(B b) {
        System.out.println("Thread 1: Holding lock A...");

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        System.out.println("Thread 1: Waiting for lock B...");
        b.last();
    }

    public synchronized void last() {
        System.out.println("Inside method A's last method");
    }
}

class B {
    public synchronized void methodB(A a) {
        System.out.println("Thread 2: Holding lock B...");

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        System.out.println("Thread 2: Waiting for lock A...");
        a.last();
    }

    public synchronized void last() {
        System.out.println("Inside method B's last method");
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        final A a = new A();
        final B b = new B();

        // Thread 1 - Tries to lock A, then B
        new Thread(() -> a.methodA(b)).start();

        // Thread 2 - Tries to lock B, then A
        new Thread(() -> b.methodB(a)).start();
    }
}
