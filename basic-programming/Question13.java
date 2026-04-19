import java.util.Scanner;

class Question13{
    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {
            int sumFor = 0;

            for (int i = 1; i <= n; i++) {
                sumFor = sumFor + i;
            }

            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumFor == sumFormula) {
                System.out.println("Both results are correct and equal");
            } else {
                System.out.println("Results are NOT equal");
            }
        }

        sc.close();
    }
}
