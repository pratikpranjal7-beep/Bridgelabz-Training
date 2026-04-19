import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char remove = sc.next().charAt(0);

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != remove) {
                result += str.charAt(i);
            }
        }

        System.out.println("Modified String: " + result);
    }
}
