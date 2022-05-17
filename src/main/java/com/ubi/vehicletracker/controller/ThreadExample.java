package com.ubi.vehicletracker.controller;

public class ThreadExample {

    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();


        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("World");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();

        System.out.println("Completed");

    }
}
