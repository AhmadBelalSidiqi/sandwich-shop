package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaring Variables
        int sandwichSize;
        int userAge;
        double  total;
        double sandwichPrice;
        double discount;
        Scanner scanner = new Scanner(System.in);

        // Input for Sandwich Size.
        String menu = """
                Please Enter 1 or 2 for the size of the sandwich:
                1: Regular: base price $5.45
                2: Large: base price $8.95
                """;
        System.out.print(menu);
        sandwichSize = Integer.parseInt(scanner.nextLine());

        // Input for user Age.
        System.out.println("Please enter you age :");
        userAge = Integer.parseInt(scanner.nextLine());

        // Using if else to determining the sandwich price
        if (sandwichSize == 1) sandwichPrice = 5.45;
        else sandwichPrice = 8.95;


        // Using if else to determining the user age for the discount.
        if (userAge > 18) discount = 0.10;
        else discount = 0.20;

        // Calculation total and displaying it.
        total = sandwichPrice-(sandwichPrice*discount);
        System.out.printf("Your total is %.2f",total);


    }
}
