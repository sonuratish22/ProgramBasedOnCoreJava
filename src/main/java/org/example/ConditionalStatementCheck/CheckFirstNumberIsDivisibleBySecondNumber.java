package org.example.ConditionalStatementCheck;

import java.util.Scanner;

public class CheckFirstNumberIsDivisibleBySecondNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers to check if the first number is divisible by the second number");
        System.out.println("Please enter the first number");
        int firstNumber= scanner.nextInt();
        System.out.println("Please enter the second number");
        int secondNumber = scanner.nextInt();

        checkIfFirstNumberIsDivisibleBySecondNumber(firstNumber,secondNumber);
        scanner.close();
    }

    private static void checkIfFirstNumberIsDivisibleBySecondNumber(int firstNumber, int secondNumber) {
        if(firstNumber == 0){
            System.out.println("Zero is divisible by any non-zero number");
        }
        else if(secondNumber == 0){
            System.out.println("Division by zero is not allowed. The second number must not be zero.");
        } else if (firstNumber % secondNumber == 0) {
            System.out.println("The first number is divisible by the second number.");
        }
        else {
            System.out.println("The first number is NOT divisible by the second number.");
        }
    }
}