package org.example.loop;

import java.util.Scanner;

public class PrintNumberFromGivenNumberToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number to get DescendingNumber");
        int num = scanner.nextInt();
        descendingNumber(num);
        scanner.close();
    }

    public static void descendingNumber(int num){
        for(int i= num; i>0; i--){
            System.out.println(i);
        }
    }
}
