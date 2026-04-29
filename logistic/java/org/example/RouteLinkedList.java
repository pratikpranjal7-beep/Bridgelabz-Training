package org.example;

class RouteLinkedList<T extends Checkpoint> {

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    Node head;

    public void addCheckpoint(T c) {
        Node newNode = new Node(c);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    public double totalDistance() {
        double sum = 0;
        Node temp = head;

        while (temp != null) {
            sum += temp.data.distanceFromLast;
            temp = temp.next;
        }
        return sum;
    }

    public double totalPenalty() {
        double sum = 0;
        Node temp = head;

        while (temp != null) {
            sum += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return sum;
    }

    public boolean checkCritical() {
        boolean delivery = false, fuel = false;

        Node temp = head;
        while (temp != null) {
            if (temp.data instanceof DeliveryCheckpoint) delivery = true;
            if (temp.data instanceof FuelCheckpoint) fuel = true;
            temp = temp.next;
        }
        return delivery && fuel;
    }

    public void printRoute() {
        Node temp = head;
        int i = 1;

        while (temp != null) {
            Checkpoint c = temp.data;
            String status = c.isDelayed() ? "Delayed" : "On Time";

            System.out.println(i++ + ". " + c.getType() + " - " +
                    c.locationName + " - " + status +
                    " - Penalty: " + c.calculatePenalty());

            temp = temp.next;
        }
    }
}