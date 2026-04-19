import java.util.*;
class Question11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate the sum");
        double number = sc.nextDouble();
        double sum =0.0;
        boolean b = true;
        while(b==true){
            sum = sum+number;
            System.out.print("Enter the zero or negative number to stop the counting");
            int a = sc.nextInt();
            if(a>0){
                b= true;
            }else{
                b = false;
            }
            if(b==true){
                System.out.print("Enter the next number to calculate");
                number = sc.nextDouble();
            }
        }
        System.out.print("Sum of the numbers by the user "+sum);


    }
}