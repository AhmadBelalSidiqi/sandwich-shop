package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaring Variables
        int sandwichSize;
        int userAge;
        boolean loaded;
        double loadedPrice;
        double total;
        double sandwichPrice;
        double discount;
        Scanner scanner = new Scanner(System.in);

        // Display  menu get user Sandwich Size.
        String menu = """
                Please Enter 1 or 2 for the size of the sandwich:
                1: Regular: base price $5.45
                2: Large: base price $8.95
                """;
        System.out.print(menu);
        sandwichSize = Integer.parseInt(scanner.nextLine());

        // Get user's preference for loaded Sandwich
        loaded = false;
        System.out.println("would u like 'loaded' sandwich (yes/no)");
        String userInput = scanner.nextLine();
        if (userInput.equals("yes")) {
            loaded = true;
        }


        // Get user's age for discount.
        System.out.println("Please enter you age :");
        userAge = Integer.parseInt(scanner.nextLine());

        // get sandwich price based on  size
        if (sandwichSize == 1) sandwichPrice = 5.45;
        else sandwichPrice = 8.95;

        // Apply discount: 10% for age 18 or under, 20% for 65 and older
        discount = 0;
        if (userAge < 18) discount = 0.10;
        else if (userAge > 64) discount = 0.20;

        // Apply additional cost of loaded Sandwich if applicable- $1 for regular and $1.75 for large
        loadedPrice=0;
        if (loaded) {
            if (sandwichSize == 1)
                loadedPrice = 1;
            else
                loadedPrice = 1.75;

        }
        // Calculation total price and displaying it.
        total = sandwichPrice - (sandwichPrice * discount) + loadedPrice;
        System.out.printf("Your total is %.2f", total);


    }
}
