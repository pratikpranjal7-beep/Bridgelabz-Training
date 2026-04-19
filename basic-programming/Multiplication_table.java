import java.util.Scanner;
class Multiplication_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter the no. - ");
        int n = input.nextInt();
		if(n>=6 && n<=9){
			for(int i=1;i<=10;i++){
				int x=i*n;
				System.out.println(n+" * "+i+" = "+x);
			}
		}else{
			System.out.println("Invalid Input");
		}
        
    }
}
