import java.util.Scanner;
class CountDown{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month in integer");
        int number = sc.nextInt();
        while(number>=1){
            System.out.print(number +"\n");
            number--;
        }

    }
}