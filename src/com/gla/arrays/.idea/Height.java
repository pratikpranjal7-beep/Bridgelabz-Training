package com.gla.arrays;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        double[] height = new double[11];
        Scanner in = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < height.length; i++) {
            height[i] = in.nextDouble();
            sum+=height[i];
        }
        System.out.println("The mean of their heights is "+ sum/3);
    }
}
