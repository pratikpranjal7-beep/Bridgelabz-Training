import java.util.Scanner;
class Countnumbers{
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to count its sum");
        double number = sc.nextDouble();
        double sum = 0.0;
        int a =1;
        while(a!=0){
            sum = sum+number;
            System.out.print("Enter 0 to stop the sum");
            a = sc.nextInt();
            if(a==0){
                break;
            }
            System.out.print("Enter the number to count its sum");
            number = sc.nextInt();

        }
        System.out.print("Count of the sum of the numbers "+sum);

    }
}