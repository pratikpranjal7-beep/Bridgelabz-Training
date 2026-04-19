import java.io.IOException;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            float result = num1/num2;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter correct input ");
        }
    }
}