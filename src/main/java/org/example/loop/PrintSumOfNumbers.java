package org.example.loop;

import java.util.Scanner;

public class PrintSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to get sum of that number");
        int num = scanner.nextInt();
        printSumOfNumbers(num);
        scanner.close();
    }

    private static void printSumOfNumbers(int num){
        int sum = 0;
        for(int i = 0; i<= num; i++){
            sum= sum+ i;
        }
        System.out.println("total Sum is : "+ sum);
    }
}

