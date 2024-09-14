package org.example.java21.exemplo1;

public class VirtualThreads {
    public static void main(String[] args) {
        Thread vThread = Thread.ofVirtual().start(() -> {
            System.out.println("Running in a virtual thread: " + Thread.currentThread());
        });

        try {
            vThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }
    }
}
