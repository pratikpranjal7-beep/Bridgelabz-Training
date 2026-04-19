import java.util.Scanner;

class MultiplicationTable {
    public static void main (String[] args) {
        System.out.print("Enter the number : ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(x + "✕" + i + "=" + x*i);
        }
    }
}
