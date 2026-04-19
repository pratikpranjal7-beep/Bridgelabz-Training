import java.util.*;
class newcls{
    static void method1() {
        int n = 10 / 0;
    }
    static void method2(){
        method1();
    }
}
public class Main{
    public static void main(String[] args){
     newcls cls = new newcls();
        try{
            cls.method1();
        }catch (ArithmeticException e){
            System.out.println("Eception handle");
        }


    }
}