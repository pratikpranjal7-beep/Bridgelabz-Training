package org.example;
class Driver {
    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public void addCheckpoint(Checkpoint cp) {
        routeHistory.addCheckpoint(cp);
    }

    public void printSummary() {
        System.out.println("\nDriver: " + driverId + " - " + name);
        System.out.println("Route Summary:");

        routeHistory.printRoute();

        double totalDistance = routeHistory.totalDistance();
        double totalPenalty = routeHistory.totalPenalty();
        double routeScore = totalDistance - totalPenalty;

        System.out.println("\nTotal Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + routeScore);

        if (routeHistory.checkCritical()) {
            System.out.println("Critical Route Check: All required checkpoints present");
        } else {
            System.out.println("Critical Route Check: Missing critical checkpoints");
        }
    }
}
