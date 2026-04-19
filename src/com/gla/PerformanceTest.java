package com.gla;
import java.util.*;

public class PerformanceTest {
    public static void main(String[] args) {
        int n = 1000000;

        int[] arr = new int[n];
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        long sum1 = 0;
        for (int x : arr) {
            sum1 += x;
        }

        long end1 = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>();
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long sum2 = 0;
        for (int x : list) {
            sum2 += x;
        }

        long end2 = System.currentTimeMillis();

        System.out.println("Array time: " + (end1 - start1));
        System.out.println("ArrayList time: " + (end2 - start2));
    }
}
