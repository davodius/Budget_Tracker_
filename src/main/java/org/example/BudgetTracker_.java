package org.example;

import java.util.Scanner;

public class BudgetTracker_ {
    public static void main(String[] args) {
        System.out.println("Welcome to the Budget Tracker! ");

        // Initializing and declaring the user method
        User.me();

        // Declaring and initializing scanner below.
        Scanner scanner = new Scanner(System.in);

        // Calling on and displaying the menu.
        new Menu();

        // Using scanner for choices in menu
        String input = scanner.nextLine();


        // Switch menu for the choices.
        switch (input) {


            // Adding earning(s) to account
            case "1":
                System.out.println("nr1");

                break;


            // Subtracting expense(s) from the account
            case "2":
                System.out.println("nr2");

                break;


            // Show account balance
            case "3":
                System.out.println("nr3");

                break;


            // Reviewing expenses
            case "4":
                System.out.println("nr4");

                break;


            // Change a previous earning
            case "5":
                System.out.println("nr5");

                break;


            // Change a previous expense
            case "6":
                System.out.println("nr6");

                break;


            // Remove a previous earning
            case "7":
                System.out.println("nr7");

                break;


            // Remove a previous expense
            case "8":
                System.out.println("nr8");

                break;


            // Exiting program
            case "0":
                System.out.println("Program is now exited. ");

                break;
        }
    }
}