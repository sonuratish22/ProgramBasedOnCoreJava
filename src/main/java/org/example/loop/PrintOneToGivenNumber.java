package org.example.loop;

import java.util.Scanner;

public class PrintOneToGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scanner.nextInt();
        printOneToGivenNumber(num);
        scanner.close();

    }

    private static void printOneToGivenNumber(int num) {
        for(int i= 1; i<=num; i++){
            System.out.println(i);
        }
    }
}
