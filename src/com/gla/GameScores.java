package com.gla;

public class GameScores {
    public static void main(String[] args) {
        Integer[] scores = {10, null, 20, null, 30};

        int countNull = 0;
        int sum = 0;

        for (Integer s : scores) {
            if (s == null) {
                countNull++;
            } else {
                sum += s;
            }
        }

        System.out.println("Not played: " + countNull);
        System.out.println("Total score: " + sum);
    }
}
