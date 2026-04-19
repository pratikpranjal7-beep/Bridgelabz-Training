import java.util.Scanner;

class Questinon14 {
    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer");
        } else {

            long factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial of " + n + " is: " + factorial);
        }

        sc.close();
    }
}
