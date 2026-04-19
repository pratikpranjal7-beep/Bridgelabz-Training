import java.util.Scanner;
class Smallest_No_Out_of_Three{
	public static void main(String[] arg){
		Scanner sc  = new Scanner(System.in);
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		float z = sc.nextFloat();
		
		System.out.printf("Is the first number the smallest? ");
		
		if(x<y && x<z){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}	