package org.example;

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Please enter an integer.");
            scanner.next(); // Clear invalid input
        }

        int number = scanner.nextInt();
        scanner.close();

        try {
            long result = factorial(number);
            System.out.println("The factorial of " + number + " is " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
