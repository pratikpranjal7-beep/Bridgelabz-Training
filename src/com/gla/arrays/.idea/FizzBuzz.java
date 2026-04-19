package com.gla.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = in.nextInt();
        if(x<=0){
            System.out.println("error");
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        for (int i = 1; i <= x ; i++) {
            if(i%3==0){
                list2.add("Fizz");
            }if(i%5==0){
                list3.add("Buzz");
            }if(i%3==0 && i%5==0){
                list4.add("FizzBuzz");
            }if (i%3!=0 && i%5!=0){
                list1.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
    }
}
