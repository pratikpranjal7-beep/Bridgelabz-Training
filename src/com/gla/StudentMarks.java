package com.gla;
import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        String[] inputs = {"85", "95", "88", "null", "abc"};

        ArrayList<Integer> valid = new ArrayList<>();

        for (String s : inputs) {
            try {
                if (!s.equals("null")) {
                    valid.add(Integer.parseInt(s));
                }
            } catch (Exception e) {

            }
        }

        int sum = 0;
        for (int x : valid) {
            sum += x;
        }

        double avg = (double) sum / valid.size();

        System.out.println("Average: " + avg);
    }
}
