import java.util.Scanner;
public class  PerimeterofaRectangle{
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the value of length of rectangle: ");
        float len = sc.nextFloat();
        System.out.print("Enter the value of width of rectangle: ");
        float wt = sc.nextFloat();
        float perim = 2*(len + wt);
        System.out.print("Perimeter of rectangle: " + perim);
        sc.close();
    }
}