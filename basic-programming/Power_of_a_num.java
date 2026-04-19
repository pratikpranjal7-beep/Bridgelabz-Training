import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the no. - ");
        int n = input.nextInt();
		System.out.print("Rise to the power - ");
        int p = input.nextInt();
		int r=1;
		
		if(n>0){
			for(int i=0; i<p; i++){
				r=r*n;
			}
			System.out.print("The result is - "+r);
		}else{
			System.out.println("Invalid Input");
		}
		
    }
}
