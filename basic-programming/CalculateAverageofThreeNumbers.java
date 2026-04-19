import java.util.Scanner;
public class  CalculateAverageofThreeNumbers{
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the value of no1: ");
        float no1 = sc.nextFloat();
        System.out.print("Enter the value of no2: ");
        float no2 = sc.nextFloat();
        System.out.print("Enter the value of no3: ");
        float no3 = sc.nextFloat();
        float avg = (no1+no2+no3)/3;
        System.out.print("Average of three numbers: "+avg);
        sc.close();
    }
}