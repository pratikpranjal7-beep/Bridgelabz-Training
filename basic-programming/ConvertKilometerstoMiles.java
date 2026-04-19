import java.util.Scanner;
public class ConvertKilometerstoMiles{
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the number in kilometers: ");
        float no = sc.nextFloat();
        double mile = no*0.621371;
        System.out.print("Kilometers into miles: "+mile);
        sc.close();
    }
}