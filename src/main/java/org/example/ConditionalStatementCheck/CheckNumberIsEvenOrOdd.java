package org.example.ConditionalStatementCheck;

import java.util.Scanner;

public class CheckNumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number to check whether the number is even or odd");
        int num = scanner.nextInt();
        checkEvenOdd(num);
        scanner.close();
    }

    public static void checkEvenOdd(int num){
        if (num % 2 == 0) {
            System.out.println("Given number, " + num + " is even number");
        } else {
            System.out.println("Given number, " + num + " is odd number");
        }
    }
}
