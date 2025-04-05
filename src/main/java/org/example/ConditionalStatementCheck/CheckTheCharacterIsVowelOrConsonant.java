package org.example.ConditionalStatementCheck;

import java.util.Scanner;

public class CheckTheCharacterIsVowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the character to check whether that character is vowel or consonant!");
        char ch = scanner.next().toLowerCase().charAt(0);
        checkIfCharacterIsVowelOrConsonant(ch);
        scanner.close();

    }

    private static void checkIfCharacterIsVowelOrConsonant(char ch) {
        if(!Character.isLetter(ch)){
            System.out.println("Invalid input, please enter a valid character");

        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The given character ' "+ ch+ "  ' is  vowel");
        }
        else {
            System.out.println("The given character ' "+ ch + " ' is consonant");
        }
    }
}
