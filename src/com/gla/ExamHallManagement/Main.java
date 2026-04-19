package com.gla.ExamHallManagement;

class Task implements Runnable {
    String name;
    int delay;

    Task(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println(name + " started | Priority: " +
                    Thread.currentThread().getPriority());
        } catch (Exception e) {}
    }
}

public class Main {
    public static void main(String[] args) {
        Thread entry = new Thread(new Task("Entry Monitoring", 0));
        Thread paper = new Thread(new Task("Question Paper", 5000));
        Thread attendance = new Thread(new Task("Attendance", 10000));
        Thread collect = new Thread(new Task("Collection", 15000));

        paper.setPriority(10);
        attendance.setPriority(8);
        entry.setPriority(5);
        collect.setPriority(7);

        entry.start(); paper.start(); attendance.start(); collect.start();
    }
}

