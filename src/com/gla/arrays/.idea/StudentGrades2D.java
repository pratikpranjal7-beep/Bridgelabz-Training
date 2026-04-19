import java.util.Scanner;

class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            marks[i][0] = sc.nextInt();
            marks[i][1] = sc.nextInt();
            marks[i][2] = sc.nextInt();

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            grade[i] = percentage[i] >= 90 ? 'A' :
                    percentage[i] >= 75 ? 'B' :
                            percentage[i] >= 60 ? 'C' : 'D';
        }

        for (int i = 0; i < n; i++)
            System.out.println("Percentage: " + percentage[i] + " Grade: " + grade[i]);

        sc.close();
    }
}
