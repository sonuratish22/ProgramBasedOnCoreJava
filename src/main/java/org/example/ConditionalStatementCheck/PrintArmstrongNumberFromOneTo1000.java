package org.example.ConditionalStatementCheck;

import java.util.Scanner;

public class PrintArmstrongNumberFromOneTo1000 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the num till which digit you want get the armstrong check ");
        int num = scanner.nextInt();
        for(int i =1 ; i <=num ;i++) {
            if(isArmstrongNumber(i)){
                System.out.println(i + " is a Armstrong Number");
            }
            /*else {
                System.out.println( i + " is not a Armstrong Number");
            }*/

        }

        scanner.close();

    }

    public static boolean isArmstrongNumber(int num){

            int originalNumber = num;
            int digitCount= 0;
            int sum = 0;
            int temp =num;
            while(temp != 0){
                temp = temp / 10;
                digitCount++;
            }
            temp = num;

            while(temp > 0){
                int digit = temp % 10;
                sum = sum+ (int)Math.pow(digit, digitCount);
                temp = temp /10;

            }
           return sum == originalNumber;
        }

}
