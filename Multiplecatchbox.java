import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = null;
        if(n > 0){
            arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
        }
        try {
            System.out.println("Enter the index of the array you want to print");
            int b = sc.nextInt();
            System.out.println("Value of the index"+b+" " +arr[b]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        catch (NullPointerException e){
            System.out.println("Array is not initialized!");
        }

    }
}
