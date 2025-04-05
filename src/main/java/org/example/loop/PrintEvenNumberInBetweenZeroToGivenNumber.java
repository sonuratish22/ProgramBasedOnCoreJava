package org.example.loop;

import java.util.Scanner;

public class PrintEvenNumberInBetweenZeroToGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scanner.nextInt();
        printNumber(num);
        scanner.close();
    }
    private static void printNumber(int num){
        for(int i =1; i<= num; i++){
            if(i % 2 == 0 ){
                System.out.println(i);
            }
        }
    }
}
