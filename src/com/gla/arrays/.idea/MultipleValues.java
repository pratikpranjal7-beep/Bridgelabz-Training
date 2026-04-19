package com.gla.arrays;

import java.util.Scanner;

public class MultipleValues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] arr = new double[10];
        int t = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = in.nextDouble();
            t++;
            if(arr[i] <= 0){
                break;
            }
        }
        int sum = 0;
        System.out.println("The elements : ");
        for (int i = 0; i < t; i++) {
            sum+=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("The sum is " + sum);
    }
}
