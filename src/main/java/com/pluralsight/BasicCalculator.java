package com.pluralsight;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {





        //Display the results//


        int first_number ;
        int second_number;
        char name;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        first_number = scanner.nextInt();


        System.out.print("Enter the second number: ");
        second_number = scanner.nextInt();


        //Possible Calculations//

        System.out.print("(A)dd\n(S)ubtract \n(M)ultiply\n(D)ivide\n");

        System.out.print("Please a enter name: ");
        name = scanner.next().charAt(0);




        if(name == ('A'))
        {
            System.out.printf("Add: %d\n", first_number + second_number);
        }
        else if(name == ('S'))
        {
            System.out.printf("Subtract: %d\n", first_number - second_number);
        }
        else if(name == ('S'))
        {
            System.out.printf("Subtract: %d\n", first_number * second_number);
        }
        else if(name == ('D')) {
            System.out.printf("Divide: %d\n", first_number / second_number);
        }

        int total_one = multiply(3,2);
        int total_two = addition(7,5);

        System.out.printf("Multiplication: %d\n", total_one);
        System.out.printf("Addition: %d", total_two);

        printToScreen();
        printToScreen();
        printToScreen();
    }


    public static int addition(int a, int b)
    {
        return a + b;
    }

    public static void printToScreen()
    {
        for(int i = 0; i <= 2; i++)
        {
            System.out.println("Hello World");
        }
    }
    public static int multiply(int first_num, int second_num)
    {
        return first_num * second_num;
    }
}


