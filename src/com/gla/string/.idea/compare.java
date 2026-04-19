import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println(str1 + " comes before " + str2);
                return;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println(str2 + " comes before " + str1);
                return;
            }
        }

        if (str1.length() < str2.length())
            System.out.println(str1 + " comes before " + str2);
        else if (str1.length() > str2.length())
            System.out.println(str2 + " comes before " + str1);
        else
            System.out.println("Both strings are equal");
    }
}
