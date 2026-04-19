import java.util.*;

public class CharacterFrequencyUnique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (text.indexOf(ch) == i)
                System.out.println(ch + " -> " + 
                    text.chars().filter(c -> c == ch).count());
        }
    }
}