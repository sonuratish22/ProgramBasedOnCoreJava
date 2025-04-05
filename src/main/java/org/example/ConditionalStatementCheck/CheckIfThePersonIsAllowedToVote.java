package org.example.ConditionalStatementCheck;

import java.util.Scanner;

public class CheckIfThePersonIsAllowedToVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age to check whether you are eligible to vote or not");
        int age = scanner.nextInt();
        checkIfYouAreEligibleForVote(age);
        scanner.close();

    }

    private static void checkIfYouAreEligibleForVote(int age) {

        if(age < 0 ){
            System.out.println("Please enter a valid age number to check whether you are eligible or not!");
        } else if (age > 120) {
            System.out.println("System Error, Normal Human can be alive only 120 Year, please contact the administrator to check whether you are eligible or not");
        } else if (age>=18 ) {
            System.out.println("Woh!! You are eligible to vote.");

        } else {
            System.out.println("Sorry, you are yet not eligible to vote. The minimum requirement to vote is 18+");
        }
    }
}
