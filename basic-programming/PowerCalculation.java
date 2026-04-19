import java.util.Scanner;
public class  PowerCalculation{
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the value of base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the value of exponent: ");
        double exponent = sc.nextDouble();
        double value = Math.pow(base, exponent);
        System.out.print("Final value of the base with respect to exponent: "+ value);
        sc.close();
    }
}