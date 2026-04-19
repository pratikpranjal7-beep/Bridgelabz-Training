package com.gla;
import java.util.*;

public class EmployeeAges {
    public static void main(String[] args) {
        int[] ages = {22, 35, 19, 45, 28};

        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages) {
            list.add(age);
        }

        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("Youngest: " + min);
        System.out.println("Oldest: " + max);
    }
}
