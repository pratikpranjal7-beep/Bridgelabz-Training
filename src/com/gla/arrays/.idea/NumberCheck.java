package com.gla.arrays;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];
        for (int number : num) {
            System.out.print("Enter the number : ");
            number = in.nextInt();
            if(number > 0){
                System.out.print("positive and ");
                if(number % 2 == 0){
                    System.out.println("Even");
                }else{
                    System.out.println("Odd");
                }
            } else if (number < 0) {
                System.out.println("negative");
            }else {
                System.out.println("zero");
            }
        }
        if (num[num.length-1] > num[0]){
            System.out.println("Last element is greater");
        }else if (num[num.length-1] < num[0]){
            System.out.println("Last element is smaller");
        }else{
            System.out.println("Both are equal");
        }
    }
}
