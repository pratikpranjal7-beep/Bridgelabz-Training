import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the no. - ");
        int n = input.nextInt();
		
		if(n>0 && n<=100){
			int i=n-1;
            while(i>1){
                if(n%i==0){
					System.out.println(i);
				}
                i--;
            }
		}else{
			System.out.println("Invalid Input");
		}
		
    }
}
