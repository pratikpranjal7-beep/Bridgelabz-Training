package com.gla.BankAccountSimulation;

class BankAccount {
    String holder;

    BankAccount(String holder) {
        this.holder = holder;
    }

    void checkBalance(String userType) {
        System.out.println(userType + " checking balance of " + holder +
                " | Priority: " + Thread.currentThread().getPriority());
    }
}

class User implements Runnable {
    BankAccount account;
    String type;

    User(BankAccount acc, String type) {
        this.account = acc;
        this.type = type;
    }

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                account.checkBalance(type);
                Thread.sleep(2000);
            }
        } catch (Exception e) {}
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Tarun");

        Thread t1 = new Thread(new User(acc, "Premium"));
        Thread t2 = new Thread(new User(acc, "Regular"));
        Thread t3 = new Thread(new User(acc, "Basic"));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start(); t2.start(); t3.start();
    }
}
