package org.example.loop;

import java.util.Scanner;

public class PrintEvenFromOneToGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scanner.nextInt();
        printEvenNumberFromOneToGivenNumber(num);
        scanner.close();
    }

    public static void printEvenNumberFromOneToGivenNumber(int num){
        for(int i = 1; i <= num ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
