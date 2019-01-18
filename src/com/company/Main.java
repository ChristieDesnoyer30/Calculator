package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Assignment #2 - Calculator
        //
        //Create a calculator application. Your program should ask the user which operation they would like to perform: addition, subtraction, multiplication, division, or square root. Depending on the user’s response, your program should request that the user input either (1) or (2) numbers to perform the desired operation.
        //
        //Your program should perform the appropriate calculation, display the result to the user, and ask if the user would like to perform another calculation. If so, the program should restart.
        //
        //Your program should include error handling for bad input.
        Scanner scan = new Scanner(System.in);
        boolean continueProgram = true;

        System.out.println("Welcome to the calculator! What mathematical operation would you like to perform?");
        System.out.println("Enter 1 to add, 2 to subtract, 3 to multiply, 4 to divide and 5 to find the square root");


        int userChoice = scan.nextInt();

        do {
            switch (userChoice) {

                case 1: //add

                    System.out.println("Please enter the first number to be evaluated");

                    int userChoice1 = scan.nextInt();

                    System.out.println("Please enter the second number to be evaulated");

                    int userChoice2 = scan.nextInt();

                    int sum = userChoice1 + userChoice2;

                    System.out.println("Adding: " + userChoice1 + " + " + userChoice2 + " = " + sum);

                    break;
                case 2:  //subtract
                    System.out.println("Please enter the first number to be evaluated");

                    userChoice1 = scan.nextInt();

                    System.out.println("Please enter the second number to be evaulated");

                    userChoice2 = scan.nextInt();


                    int difference = userChoice1 + userChoice2;

                    System.out.println("Subtracting: " + userChoice1 + " - " + userChoice2 + " = " + difference);

                    break;

                case 3:  //multiply
                    System.out.println("Please enter the first number to be evaluated");

                    userChoice1 = scan.nextInt();

                    System.out.println("Please enter the second number to be evaulated");

                    userChoice2 = scan.nextInt();

                    int result = userChoice1 + userChoice2;

                    System.out.println("Multiplying:  " + userChoice1 + " + " + userChoice2 + " = " + result);

                    break;
                case 4:   //divide

                    System.out.println("Please enter the first number to be evaluated");

                    userChoice1 = scan.nextInt();

                    System.out.println("Please enter the second number to be evaulated");

                    userChoice2 = scan.nextInt();

                    int dividend = userChoice1 / userChoice2;


                    System.out.println("Dividing: " + userChoice1 + " / " + userChoice2 + " = " + dividend);

                    break;

                case 5:   //square root

                    System.out.println("Please enter the number to be evaluated");

                    userChoice1 = scan.nextInt();

                    double sqrt = Math.sqrt(userChoice1);

                    System.out.println("The square root of " + userChoice1 + "equals  " + sqrt);

                    break;

            }

            System.out.println("Would you like to perform another calculation? Press 1 for yes and 2 for no.");

            userChoice = scan.nextInt();

            if (userChoice == 1) {
                continueProgram = true;
            } else {
                continueProgram = false;
            }


        } while (continueProgram);

        System.out.println("Thank you for using this program!");
    }

}
