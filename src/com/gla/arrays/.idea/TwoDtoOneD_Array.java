package com.gla.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDtoOneD_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = in.nextInt();
        System.out.print("Enter no. of columns : ");
        int cols = in.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int[] arr = new int[rows*cols];
        int t = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[t] = matrix[i][j];
                t++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
