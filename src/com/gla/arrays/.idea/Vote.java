package com.gla.arrays;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] stu = new int[10];
        for (int age : stu) {
            System.out.print("The age of Student : ");
            age = in.nextInt();
            if(age>=18){
                System.out.println("can vote");
            }
            else{
                System.out.println("can't vote");
            }
        }

    }
}