package com.gla.FoodDeliverySystem;

class Order implements Runnable {
    int id;
    String restaurant;
    int time;

    Order(int id, String restaurant, int time) {
        this.id = id;
        this.restaurant = restaurant;
        this.time = time;
    }

    public void run() {
        try {
            System.out.println("Order " + id + " picked up by " +
                    Thread.currentThread().getName());

            Thread.sleep(time * 500);

            System.out.println("Order " + id + " in transit");
            Thread.sleep(time * 500);

            System.out.println("Order " + id + " delivered");
        } catch (Exception e) {}
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Order(1, "KFC", 3));
        Thread t2 = new Thread(new Order(2, "Dominos", 2));
        Thread t3 = new Thread(new Order(3, "BurgerKing", 4));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);

        t1.start(); t2.start(); t3.start();
    }
}
