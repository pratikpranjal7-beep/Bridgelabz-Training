import java.util.Scanner;
public class  CalculateSimpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value Principal: ");
        float pri = sc.nextFloat();
        System.out.println("Enter the value Time: ");
        float time = sc.nextFloat();
        System.out.println("Enter the value Rate: ");
        float rate = sc.nextFloat();
        float SI = pri*time*rate;
        System.out.println("Calculated Simple Interested: " + SI);
        sc.close();
    }
}