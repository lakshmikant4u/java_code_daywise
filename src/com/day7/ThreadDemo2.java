package com.day7;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread: " + Thread.currentThread().getName());
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t2 = new Thread(new MyRunnable());
        t2.start(); // Start the thread
    }
}
