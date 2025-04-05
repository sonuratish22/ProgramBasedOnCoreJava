package org.example.ConditionalStatementCheck;

import java.util.Scanner;

public class CheckNumberIsPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number to check whether the number is positive, negative or Zero");
        int num = scanner.nextInt();
        checkPositiveNegativeOrZeroNumber(num);
        scanner.close();
    }

    private static void checkPositiveNegativeOrZeroNumber(int num) {
        if(num==0){
            System.out.println("Give number is Zero");
        } else if (num > 0) {
            System.out.println("Given number is positive number");
        }
        else {
            System.out.println("Given number is Negative Number");
        }
    }
}
