package org.example;
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // to allow the program to read input from the user
            Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        // Prompt the user to enter the operator
        System.out.print("Enter the operator (+, -, *, /, %): ");
        String operator = scanner.nextLine();
        }
}