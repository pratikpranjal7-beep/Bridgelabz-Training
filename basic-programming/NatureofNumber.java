import java.util.Scanner;
class NatureofNumber{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int number = sc.nextInt();
        if(number>=1){
            System.out.print("Number is positive");
        }else if(number==0){
            System.out.print("number is negative");
        }else{
			System.out.print("Number is negative");
		}




    }
}