package Practice;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double dF = input.nextDouble();

        double dY = dF / 3.0;

        double dM = dY / 1760.0;

        // Output
        System.out.println("The distance of " + dF + " feet is " + dY + " yards and " +
                dM + " miles.");


    }
}

