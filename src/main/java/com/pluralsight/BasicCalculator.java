package com.pluralsight;
import java.util.Scanner;

// Basic calculator class that performs simple arithmetic operations
public class BasicCalculator {
    public static void main(String[] args) {

        // Declare variables to store user input
        int first_number;     // Stores the first number from user
        int second_number;    // Stores the second number from user
        char name;           // Stores the operation choice from user

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Get first number from user
        System.out.print("Enter the first number: ");
        first_number = scanner.nextInt();

        // Get second number from user
        System.out.print("Enter the second number: ");
        second_number = scanner.nextInt();

        // Display menu of available operations
        System.out.print("(A)dd\n(S)ubtract \n(M)ultiply\n(D)ivide\n");

        // Get operation choice from user
        System.out.print("Please a enter name: ");
        name = scanner.next().charAt(0);  // Takes first character of input

        // Perform calculation based on user's choice
        if(name == ('A')) {
            // Addition operation
            System.out.printf("Add: %d\n", first_number + second_number);
        }
        else if(name == ('S')) {
            // Subtraction operation
            System.out.printf("Subtract: %d\n", first_number - second_number);
        }
        else if(name == ('S')) {  // Note: This is a duplicate of subtract case
            // This should be 'M' for multiply
            System.out.printf("Subtract: %d\n", first_number * second_number);
        }
        else if(name == ('D')) {
            // Division operation
            System.out.printf("Divide: %d\n", first_number / second_number);
        }

        // Additional calculations using methods
        int total_one = multiply(3,2);    // Call multiply method
        int total_two = addition(7,5);    // Call addition method

        // Display results of method calls
        System.out.printf("Multiplication: %d\n", total_one);
        System.out.printf("Addition: %d", total_two);

        // Call printToScreen method three times
        printToScreen();
        printToScreen();
        printToScreen();
    }

    // Method to add two numbers
    public static int addition(int a, int b) {
        return a + b;
    }

    // Method to print "Hello World" three times
    public static void printToScreen() {
        for(int i = 0; i <= 2; i++) {
            System.out.println("Hello World");
        }
    }

    // Method to multiply two numbers
    public static int multiply(int first_num, int second_num) {
        return first_num * second_num;
    }
}
