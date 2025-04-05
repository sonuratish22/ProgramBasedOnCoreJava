package org.example.ConditionalStatementCheck;

import java.util.Scanner;

public class GradingSystemOfMarks {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome!, i am your grading system");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your mark to check your grading");
        double num= scanner.nextDouble();
        enterNumberToCheckYourGrade(num);
        scanner.close();
    }

    private static void enterNumberToCheckYourGrade(double num) {

        if(num < 0 ){
            System.out.println("Invalid number, Please enter the correct mark!!");
        } else if (num > 100) {
            System.out.println("Invalid number, Mark can't be exceed 100!!");

        } else if (num >= 75 && num <= 100) {
            System.out.println("Distinction Mark!!");
            System.out.println("First Grade");

        }
        else if (num >= 60 && num < 75) {
            System.out.println("First Grade!!");
        } else if (num >= 45 && num <60 ) {
            System.out.println("Second Grade!!");
        }else if (num >= 30 && num <45 ) {
            System.out.println("Third Grade!!");
        }else if(num>=0 && num < 30) {
            System.out.println("Failed, Work Hard my boy");
        }

    }
}
