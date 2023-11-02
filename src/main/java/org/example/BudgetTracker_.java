package org.example;

import java.io.IOException;
import java.util.Scanner;

public class BudgetTracker_ {
    public static void main(String[] args) throws IOException  {
        System.out.println("Welcome to the Budget Tracker! ");

        // Initializing and declaring the user method
        User.me();

        // Declaring and initializing scanner below.
        Scanner scanner = new Scanner(System.in);

        // Calling on and displaying the menu.
        new Menu();

        // Using scanner for choices in menu
        String input = scanner.nextLine();

        // skapad instans av IncomeStorage för att komma åt metoder
        IncomeStorage incomeStorage = new IncomeStorage();

        // läser in fil
        //incomeStorage.readFile();


        // Switch menu for the choices.
        switch (input) {


            // Adding earning(s) to account
            case "1":

                //  System.out.println("nr1");
                System.out.println("Please add id:");
                String id = scanner.nextLine();

                System.out.println("Please add date:");
                String date = scanner.nextLine();

                System.out.println("Enter amount for income:");
                double amount = scanner.nextDouble();
                // tar emot user input

                // Skapar en ny income av all user input data
                Income income = new Income(id, date, amount);

                incomeStorage.addIncome(income);


                incomeStorage.saveFile();

                System.out.println("Income added!");

                break;


            // Subtracting expense(s) from the account
            case "2":
                System.out.println("Which id to you want to remove?");
                String idToRemove = scanner.nextLine();
                incomeStorage.removeIncome(idToRemove);
                //incomeStorage.saveFile();

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