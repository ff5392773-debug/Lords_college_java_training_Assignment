package org.example.assignment;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Simple Calculator ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an option (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = 0;

        if (choice == 1) {
            result = num1 + num2;
            System.out.println("Result = " + result);
        } else if (choice == 2) {
            result = num1 - num2;
            System.out.println("Result = " + result);
        } else if (choice == 3) {
            result = num1 * num2;
            System.out.println("Result = " + result);
        } else if (choice == 4) {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero!");
            } else {
                result = num1 / num2;
                System.out.println("Result = " + result);
            }
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

