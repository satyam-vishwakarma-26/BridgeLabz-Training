package com.interfaces.functional;
public class BackgroundJob {
    public static void main(String[] args) {

        // Runnable task using lambda
        Runnable backgroundTask = () -> {
            System.out.println("Background job started...");

            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                System.out.println("Job interrupted");
            }

            System.out.println("Background job completed!");
        };

        // Execute task asynchronously
        Thread workerThread = new Thread(backgroundTask);
        workerThread.start();

        System.out.println("Main thread continues executing...");
    }
}