package org.example.ConditionalStatementCheck;

import java.util.Scanner;

public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your input to check number is palindrome");
        int num = scanner.nextInt();
        isPalindrome(num);
        scanner.close();

    }

    public static void isPalindrome(int num){
        int temp = num;
        int reveseNumber= 0;
        int reminder = 0;
        while(num > 0){
            reminder = num % 10;
            reveseNumber = reveseNumber * 10 + reminder;
            num = num / 10;
        }
        if(temp== reveseNumber){
            System.out.println(" Given number is palindrome.");
        }
        else {
            System.out.println("Given number is not a palindrome.");
        }
    }



}