package org.example.ConditionalStatementCheck;

import java.util.Scanner;

public class CheckIfNumberIsDivisibleByThreeOrFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number to check whether the number is divisible by 3 and 5");
        int num = scanner.nextInt();
        checkNumberDivisibleByThreeOrFive(num);
        scanner.close();
    }

    private static void checkNumberDivisibleByThreeOrFive(int num) {
        if(num <= 0 ){
            System.out.println("Please enter the correct number which is greater than Zero");
        } else if (num % 3 ==0 && num % 5 == 0) {
            System.out.println("The given number is divisible by both 3 and 5");
        } else if (num % 3 ==0 ) {
            System.out.println("The given number is divisible by 3 but not by 5");
        }else if (num % 5 ==0 ) {
            System.out.println("The given number is divisible by 5 but not by 3");
        }
        else {
            System.out.println("The given number is not divisible by either 3 or 5");
        }

    }
}
