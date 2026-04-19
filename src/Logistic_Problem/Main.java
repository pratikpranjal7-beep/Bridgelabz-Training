package Logistic_Problem;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("D1204", "Tarun Kumar Singh");

        driver.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("C1", "Warehouse A", 40.0, 60, 70));

        driver.routeHistory.addCheckpoint(
                new FuelCheckpoint("C2", "Pump 12", 20.0, 30, 30));

        driver.routeHistory.addCheckpoint(
                new RestCheckpoint("C3", "Motel X", 10.0, 20, 35));

        driver.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("C4", "Client Hub", 50.0, 80, 95));

        driver.printSummary();
    }
}
