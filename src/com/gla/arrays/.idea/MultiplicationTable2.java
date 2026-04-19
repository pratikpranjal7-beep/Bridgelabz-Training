package com.gla.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = in.nextInt();
        int[] storer = new int[4];
        for (int i = 6,j = 0; i <= 9 ; i++,j++) {
            storer[j] = x*i;
        }
        for (int i = 6,j = 0; i < 10; i++,j++) {
            System.out.println(x+" * "+i+" = "+storer[j]);
        }
    }
}
