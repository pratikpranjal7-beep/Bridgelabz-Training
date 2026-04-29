package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Driver ID: ");
        String driverId = sc.nextLine();

        System.out.print("Enter Driver Name: ");
        String name = sc.nextLine();

        RouteLinkedList<Checkpoint> route = new RouteLinkedList<>();

        System.out.print("Enter number of checkpoints: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nCheckpoint " + (i + 1));

            System.out.print("Type (1=Delivery, 2=Fuel, 3=Rest): ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("Location: ");
            String loc = sc.nextLine();

            System.out.print("Distance: ");
            double dist = sc.nextDouble();

            System.out.print("Expected duration: ");
            int exp = sc.nextInt();

            System.out.print("Actual duration: ");
            int act = sc.nextInt();

            Checkpoint cp;

            if (type == 1)
                cp = new DeliveryCheckpoint(id, loc, dist, exp, act);
            else if (type == 2)
                cp = new FuelCheckpoint(id, loc, dist, exp, act);
            else
                cp = new RestCheckpoint(id, loc, dist, exp, act);

            route.addCheckpoint(cp);
        }

        System.out.println("\nDriver: " + driverId + " - " + name);
        System.out.println("Route Summary:");
        route.printRoute();

        double distance = route.totalDistance();
        double penalty = route.totalPenalty();
        double score = distance - penalty;

        System.out.println("\nTotal Distance: " + distance);
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + score);
        System.out.println("Critical Check: " +
                (route.checkCritical() ? "All present" : "Missing critical checkpoints"));
    }
}
