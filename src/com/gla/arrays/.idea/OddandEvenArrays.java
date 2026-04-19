package com.gla.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class OddandEvenArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. of numbers : ");
        int x = in.nextInt();
        if (x <= 0) {
            System.out.println("an error");
            return;
        }
        ArrayList<Integer> oddArray = new ArrayList<>();
        ArrayList<Integer> evenArray = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                evenArray.add(i);
            } else {
                oddArray.add(i);
            }
        }
        System.out.println(evenArray);
        System.out.println(oddArray);
    }
}
