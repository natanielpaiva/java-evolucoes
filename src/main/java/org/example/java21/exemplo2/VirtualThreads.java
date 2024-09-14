package org.example.java21.exemplo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreads {
    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++) {
                final int index = i;
                executor.submit(() -> {
                    System.out.println("Task " + index + " is running in: " + Thread.currentThread());
                    try {
                        Thread.sleep(1000); // Simulando operação bloqueante
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }
        }
        // O executor é automaticamente fechado ao sair do try-with-resources.
    }
}