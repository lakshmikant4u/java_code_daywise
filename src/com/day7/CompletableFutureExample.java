package com.day7;

import java.util.concurrent.*;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            return "Data fetched";
        }).thenApply(data -> data + " and processed")
          .thenAccept(System.out::println);

        System.out.println("Main thread is free to do other tasks...");
    }
}
