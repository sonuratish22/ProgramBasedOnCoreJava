package org.example.ConditionalStatementCheck;

import java.util.Scanner;

public class CheckYearIsLeapYearOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number in YYYY format to get the Year is Leap Year or not");
        int year = scanner.nextInt();
        checkLeapYearOrNot(year);
        scanner.close();
    }

    private static void checkLeapYearOrNot(int year) {
        if(year < 0){
            System.out.println("Please enter the correct year format!");
        } else if ((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0) {
            System.out.println("Given year  " + year + "  is a leap Year");
        }
        else {
            System.out.println("Given year " + year + " is not a leap year");
        }

    }

}
