package org.example.loop;

import java.util.Scanner;

public class PrintNumberFromOneToNextGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number till you want to print");
        int num = scanner.nextInt();
        getNumbersFromOneToNextGivenNumber(num);
        scanner.close();
    }

    public static void getNumbersFromOneToNextGivenNumber(int num){
        for(int i = 1; i <= num ; i++ ){
            System.out.println(i);
        }
    }
}
