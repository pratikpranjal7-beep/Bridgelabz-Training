import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble(); // kg
        double heightCm = input.nextDouble(); // cm

        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        input.close();
    }
}
