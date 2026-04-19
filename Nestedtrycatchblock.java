import javax.xml.transform.Source;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int[] arr = new int[5];
            for(int i=0;i<arr.length;i++) {
                arr[i] = sc.nextInt();
            }
                System.out.println("Enter the divisor");
                int divisor = sc.nextInt();
                System.out.println("Enter the index of the between 0 to 4");
                int a = sc.nextInt();
                try {
                        int result = arr[a]/divisor;
                    System.out.println(result);

                }catch(ArithmeticException e){
                    System.out.println("Cannot divide the zero");
                }
            }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid Index array");
        }
    }
        }