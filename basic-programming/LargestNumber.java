import java.util.Scanner;
class LargestNumber{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number");
        int number3 = sc.nextInt();
        if(number1>number2 && number1>number3 ){
            System.out.println("Is the first number the largest? yes \n");
            System.out.println("Is the second number the largest?  no \n ");
            System.out.println("Is the third number the largest?  no \n ");
        }else if(number2>number1 && number2>number3){
            System.out.println("Is the first number the largest? no \n");
            System.out.println("Is the second number the largest?  yes \n ");
            System.out.println("Is the third number the largest?  no \n ");
        }else{
            System.out.println("Is the first number the largest? no \n");
            System.out.println("Is the second number the largest?  no \n ");
            System.out.println("Is the third number the largest?  yes \n ");
        }


    }
}