package com.day7;

import java.util.Random;

class PrintJob implements Runnable {
    private String jobName;

    public PrintJob(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public void run() {
        synchronized (PrintQueue.class) {
            System.out.println(jobName + " started.");
            try {
                Thread.sleep(new Random().nextInt(3000));  // Simulate printing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(jobName + " completed.");
        }
    }
}

class PrintQueue {
    public void addJob(String jobName) {
        Thread printThread = new Thread(new PrintJob(jobName));
        printThread.start();
    }
}

public class PrintJobManager {
    public static void main(String[] args) throws InterruptedException {
        PrintQueue printQueue = new PrintQueue();

        // Simulating multiple print jobs
        printQueue.addJob("Document 1");
        printQueue.addJob("Document 2");
        printQueue.addJob("Document 3");
        printQueue.addJob("Document 4");
    }
}

