import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the age of Amar - ");
        int a = input.nextInt();
		System.out.print("Enter the age of Akbar - ");
        int b = input.nextInt();
		System.out.print("Enter the age of Anthony - ");
        int c = input.nextInt();
        System.out.print("Enter the height of Amar - ");
        float x = input.nextFloat();
		System.out.print("Enter the height of Akbar - ");
        float y = input.nextFloat();
		System.out.print("Enter the height of Anthony - ");
        float z = input.nextFloat();
		
		if(a<b && a<c){
			System.out.println("Amar is youngest");
		}else if(b<a && b<c){
			System.out.println("Akbar is youngest");
		}else{
			System.out.println("Anthony is youngest");
		}
		
		if(x>y && x>z){
			System.out.println("Amar is tallest");
		}else if(y>x && y>z){
			System.out.println("Akbar is tallest");
		}else{
			System.out.println("Anthony is tallest");
		}
		
    }
}
