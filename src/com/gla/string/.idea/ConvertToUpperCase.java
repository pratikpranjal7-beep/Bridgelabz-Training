import java.util.Scanner;

public class ConvertToUpperCase {

    public static String convertUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') ch = (char)(ch - 32);
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println("User Upper: " + convertUpper(text));
        System.out.println("Built-in Upper: " + text.toUpperCase());
    }
}