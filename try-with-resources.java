import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
class Main{
    public static void main(String[] args){
        String filepath = "C:\\Users\\Admin\\Desktop\\info.txt";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;
            line = reader.readLine();
            if(line!=null){
                System.out.println(line);
            }else{
                System.out.println("File is empty");
            }
        }catch (IOException e){
            System.out.println("Error reading file");
        }
    }
}