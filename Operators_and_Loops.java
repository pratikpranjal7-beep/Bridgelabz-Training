import java.util.Scanner;
public class Operators_and_Loops{
	public static void main(String[] arg){
		
		int i=0;
		System.out.println("value : " +i); //0
		i++;
		System.out.println("value a : " + i++); //1
		System.out.println("value b : " + i); //2
		++i;
		System.out.println("value c : " + i++); //3
		System.out.println("value d : " + i++); //4
		int z = i + i++ + ++i + i + ++i + i++;  
		System.out.println(z); //40
		System.out.println(i); //9
		
		for(int j=0; j<10; j++){
			System.out.println("j:"+j);
		}
		
		int k=10;
		while(k>0){
			System.out.println("k:" +k);
			k--;
		}
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(x);
		
		
	}
}