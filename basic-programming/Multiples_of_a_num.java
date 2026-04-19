import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the no. - ");
        int n = input.nextInt();
		
		if(n>0 && n<=100){
			for(int i=100; i>0; i--){
				if(n%i==0){
					System.out.println(i);
				}
			}
		}else{
			System.out.println("Invalid Input");
		}
		
    }
}
