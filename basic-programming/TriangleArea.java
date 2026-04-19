package Practice;
import java.util.Scanner;
public class TriangleArea {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter base of the triangle (in cm): ");
            double baseCm = input.nextDouble();

            System.out.print("Enter height of the triangle (in cm): ");
            double heightCm = input.nextDouble();

            double areaCm2 = 0.5 * baseCm * heightCm;

            double areaInch2 = areaCm2 / (2.54 * 2.54);

            System.out.println("The area of the triangle is " + areaCm2 + " square centimeters");
            System.out.println("The area of the triangle is " + areaInch2 + " square inches");

    }
}
