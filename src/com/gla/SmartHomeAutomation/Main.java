package com.gla.SmartHomeAutomation;

class Device implements Runnable {
    String name;
    int interval;

    Device(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " running | Cycle: " + i +
                        " | Priority: " + Thread.currentThread().getPriority());
                Thread.sleep(interval);
            }
        } catch (Exception e) {}
    }
}

public class Main {
    public static void main(String[] args) {
        Thread temp = new Thread(new Device("Temperature", 5000));
        Thread cam = new Thread(new Device("Security Camera", 3000));
        Thread light = new Thread(new Device("Light", 4000));
        Thread door = new Thread(new Device("Door", 6000));

        cam.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        temp.start(); cam.start(); light.start(); door.start();
    }
}
