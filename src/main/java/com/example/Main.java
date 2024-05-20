package com.example;

import java.time.Duration;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        try (var executor = Executors.newSingleThreadExecutor()) {
            int i = 0;
            while (i < 10_000) {
                executor.execute(() -> {
                    try {
                        System.out.println("Starting to execute task");
                        Thread.sleep(Duration.ofSeconds(1));
                        System.out.println("Task executed");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                });
                i++;
            }
        }

    }

}
