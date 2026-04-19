import java.util.Scanner;
public class VolumeofaCylinder{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        float pi = 3.14f;
        System.out.print("Enter value of radius of a cylinder : ");
        float radius = sc.nextFloat();
        System.out.print("Enter the value of height cylinder ");
        float height = sc.nextFloat();
        float volume = pi*(radius*radius)*height;
        System.out.println("Volume of the cylinder " + volume);


    }

}