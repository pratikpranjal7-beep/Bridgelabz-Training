package com.gla;

public class ShoppingCartCase2 {
    public static void main(String[] args) {
        String[] prices = {"250", "499", "99", "abc"};

        int total = 0;

        for (String price : prices) {
            try {
                int value = Integer.parseInt(price);
                total += value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price: " + price);
            }
        }

        System.out.println("Total Price = " + total);
    }
}
