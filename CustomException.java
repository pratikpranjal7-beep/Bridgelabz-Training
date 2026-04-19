import java.util.*;
class exception{
    void validateAge(int age){
        if(age>=18){
            System.out.println("Access is granted");
        }else{
            throw new RuntimeException("InvalidAgeException");
        }
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        exception ex = new exception();
        System.out.println("enter the age");
        int n = sc.nextInt();
        ex.validateAge(n);
    }
}