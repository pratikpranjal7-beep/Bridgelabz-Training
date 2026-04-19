package com.gla;
import java.util.*;

public class Ratings {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(null);
        list.add(4);

        ArrayList<Integer> merged = new ArrayList<>();

        for (int x : arr) {
            merged.add(x);
        }

        for (Integer x : list) {
            if (x != null) {
                merged.add(x);
            }
        }

        int sum = 0;
        for (int x : merged) {
            sum += x;
        }

        double avg = (double) sum / merged.size();

        System.out.println("Average Rating: " + avg);
    }

}
