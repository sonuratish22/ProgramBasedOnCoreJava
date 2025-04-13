package org.example.loop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number to get the multiplication of that number");
        int num = scanner.nextInt();
        getNumberTable(num);
        scanner.close();

    }

    public static void getNumberTable(int num){
        for(int i= 1; i<=10; i++){
            System.out.println(num + " X " + i + " = "+ (num*i));
        }
    }
}
