import java.util.Scanner;
class Vote{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age");
        int number = sc.nextInt();
        if(number>=18){
            System.out.print("He/She can vote");
        }else{
            System.out.print("He/She cannot vote");
        }
        



    }
}