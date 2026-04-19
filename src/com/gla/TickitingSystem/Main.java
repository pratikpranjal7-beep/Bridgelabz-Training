package com.gla.TickitingSystem;

class Ticket extends Thread {
    String type;

    Ticket(String type, int priority) {
        this.type = type;
        setPriority(priority);
    }

    public void run() {
        try {
            int time = (int)(Math.random() * 4000) + 1000;

            System.out.println(type + " started by " + getName() +
                    " | Priority: " + getPriority());

            Thread.sleep(time);

            System.out.println(type + " completed");
        } catch (Exception e) {}
    }
}

public class Main {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("Critical Bug", 10);
        Ticket t2 = new Ticket("Feature Request", 4);
        Ticket t3 = new Ticket("General Query", 2);
        Ticket t4 = new Ticket("Feedback", 1);

        t1.start(); t2.start(); t3.start(); t4.start();
    }
}
