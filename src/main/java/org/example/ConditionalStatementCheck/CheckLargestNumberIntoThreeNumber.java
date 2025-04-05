package org.example.ConditionalStatementCheck;

import java.util.Scanner;

public class CheckLargestNumberIntoThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers to check which number is largest among three");
        System.out.println("Please enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter the third number");
        int thirdNumber = scanner.nextInt();
        checkLargestNumberAmongGivenNumber(firstNumber, secondNumber, thirdNumber);
        scanner.close();
    }

    private static void checkLargestNumberAmongGivenNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if( (firstNumber == secondNumber) && ( firstNumber== thirdNumber)){
            System.out.println("All 3 number is same, so no comparison can be applicable");
            return;
        }

        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println(firstNumber + " first Number is greater among all given three number");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber + " Second Number is greater among all given three number");
        }
        else {
            System.out.println( thirdNumber + " Third number is largest among all 3 number");
        }
    }
}
