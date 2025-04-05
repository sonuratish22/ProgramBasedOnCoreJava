package org.example.ConditionalStatementCheck;

import java.util.Scanner;

public class CheckIfCharIsAlphabetDigitAndSpecialChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your input to check whether input is char, digit and special char");
        char ch = scanner.next().toLowerCase().charAt(0);
        checkIfGivenCharIsAlphabetDigitAndSpecialChar(ch);
        scanner.close();
    }

    private static void checkIfGivenCharIsAlphabetDigitAndSpecialChar(char ch){

        if(ch >= '0' && ch <= '9' ){
            System.out.println("The given character is Number" );
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println("The given character   is alphabet");
        }  else {
            System.out.println("The given character  is special character");
        }
    }
}
