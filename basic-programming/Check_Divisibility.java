import java.util.Scanner;
public class Check_Divisibility {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.println("Is the number "+x+" divisible by 5?");
		if(x%5==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}