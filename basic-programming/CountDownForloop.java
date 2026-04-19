import java.util.Scanner;
class CountDownForloop{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month in integer");
        int number = sc.nextInt();
        for(int i=number;i>=1;i--){
            System.out.print(i+ "\n");
        }

    }
}