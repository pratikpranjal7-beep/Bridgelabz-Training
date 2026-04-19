import java.util.Scanner;
class Bonus_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Salary - ");
        int x = input.nextInt();
		System.out.print("How long are you serving - ");
		int t = input.nextInt();
		if(t>5){
			int b = (x*5)/100;
			System.out.println("Your Bonus is - Rs " +b);
		}else{
			System.out.println("You are not eligible for bonus");
		}
        
    }
}
