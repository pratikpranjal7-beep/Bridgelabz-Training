import java.util.Scanner;
class SumofNaturalno{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to check natural number and calculate sum of n natural number");
        int number = sc.nextInt();
        if(number>0){
            System.out.print("It is a natural number \n");
			int sum = number*(number+1)/2;
			System.out.print("Sum of natural numbers "+ sum);
        }else{
			System.out.print("It is not a natural number \n");
		}



    }
}