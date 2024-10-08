package org.example;

import java.io.IOException;
import java.util.Scanner;

public class BudgetTracker_ {

    public static void main(String[] args) throws IOException  {

try {

        System.out.println("Welcome to the Budget Tracker! ");

        // Initializing and declaring the user method
        User.me();

        // Declaring and initializing scanner below.
        Scanner scanner = new Scanner(System.in);

      while (true) {
          // Calling on and displaying the menu.
          new Menu();


          // Using scanner for choices in menu
          String input = scanner.nextLine();


          // skapad instans av IncomeStorage för att komma åt metoder
          IncomeStorage incomeStorage = new IncomeStorage();

          // läser in fil
          incomeStorage.readFile();


          // Switch menu for the choices.
          switch (input) {


              // Adding earning(s) to account
              case "1":
                  try {

                      System.out.println("Please add id:");
                      String id = scanner.nextLine();

                      System.out.println("Please add date:");
                      String date = scanner.nextLine();

                      System.out.println("Enter amount for income:");
                      double amount = scanner.nextDouble();
                      // tar emot user input


                      scanner.reset();
                      // Skapar en ny income av all user input data
                      Income income = new Income(id, date, amount);
                      //incomeStorage.readFile();

                      incomeStorage.addIncome(income);
                      //income.setCategory(EIncomeCategory.PAYCHECK);
                      incomeStorage.saveFile();


                  } catch (Exception e) {
                      System.out.println("Income was not added");
                  }


                  break;


              // Subtracting expense(s) from the account
              case "2":
                  incomeStorage.readFile();

                  System.out.println("Which id do you want to remove?");
                  //System.out.println(EIncomeCategory.PAYCHECK);
                  String idToRemove = scanner.nextLine();
                  incomeStorage.removeIncome(idToRemove);
                  incomeStorage.saveFile();

                  break;


              // Show account balance
              case "3":
                  System.out.println(incomeStorage.totalIncome());

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
              default:

                  System.out.println("incorrectly input value");
                  break;
          }
      }
    } catch (Exception e){
        System.out.println("Incorrect input");
    }
}}