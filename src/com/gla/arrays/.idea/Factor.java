import java.util.ArrayList;
import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = in.nextInt();
        if(x<=0){
            System.out.println("error");
        }
        ArrayList<Integer> LIST = new ArrayList<>();
        for (int i = 1; i <= x ; i++) {
            if(x%i==0){
                LIST.add(i);
            }
        }
        System.out.println("The factors of " + x + " = " + LIST);
    }
}
