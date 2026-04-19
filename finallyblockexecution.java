import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the number1 and number2");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = num1/num2;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Airthemetic exception is coming");
        }
        finally{
            System.out.println("Operation completed");
        }

    }
}