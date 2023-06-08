package org.example;
// class library  for simple text scanning
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // to allow the program to read input from the user
            Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        // Prompt the user to enter the operator
        System.out.print("Enter the operator : ");
        String operator = scanner.nextLine();


        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        // Perform the arithmetic operation based on the operator
        double result = 0.0;

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
//             Math.multiplyFull(a, b);
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return; // Terminate the program if division by zero occurs
            }
        } else if (operator.equals("%")) {
            result = num1 % num2;
        } else {
            System.out.println("Error: Invalid operator.");
            return; // Terminate the program if an invalid operator is entered
        }

        System.out.println("Result: " + result);

    }

// Using Switch Case
private double number1, number2;
private String operator;

    public double main(double number1, double number2, String operator){
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;

        return switch (this.operator){
            case "+" -> addition();
            case "-" -> subtraction();
            case "*" -> multiplication();
            case "/" -> division();
            case "%" -> modulus();
            default -> 0;
        };
    }


    private double addition(){
        return this.number1 + this.number2;
    }

    private double multiplication(){
        return this.number1 * this.number2;
    }

    private double division(){
        return this.number1 / this.number2;
    }

    private double modulus(){
        return this.number1 % this.number2;
    }

    private double subtraction(){
        return this.number1 - this.number2;
    }
}
