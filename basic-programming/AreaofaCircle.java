import java.util.Scanner;
public class  AreaofaCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f;
        System.out.print("Enter the value of radius: ");
        float radius = sc.nextFloat();
        float radius2 = radius*radius;
        float area =pi*radius2;
        System.out.print("Area of the circle : " + area);

    }
}