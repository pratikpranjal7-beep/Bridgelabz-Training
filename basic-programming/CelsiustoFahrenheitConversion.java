import java.util.Scanner;
public class  CelsiustoFahrenheitConversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in celcius: ");
        float temp = sc.nextFloat();
        float faren = (temp* 9/5) +32;
        System.out.print("Temperature converted into celcius int faremhite: " + faren);
        sc.close();
    }
}