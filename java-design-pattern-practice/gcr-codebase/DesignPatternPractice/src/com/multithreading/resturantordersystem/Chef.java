
package com.multithreading.resturantordersystem;

class Chef extends Thread {

    private String dish;
    private long preparationTime; // in milliseconds

    public Chef(String name, String dish, long preparationTime) {
        super(name); // thread name
        this.dish = dish;
        this.preparationTime = preparationTime;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started preparing " + dish);

        try {
            int[] progress = { 25, 50, 75, 100 };
            long stepTime = preparationTime / 4;

            for (int p : progress) {
                Thread.sleep(stepTime);
                System.out.println(getName() + " preparing " + dish +
                        ": " + p + "% complete");
            }

            System.out.println(getName() + " completed " + dish);

        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted while cooking " + dish);
        }
    }
}
