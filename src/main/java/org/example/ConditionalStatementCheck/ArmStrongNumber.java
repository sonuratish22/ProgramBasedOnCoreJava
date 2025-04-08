package org.example.ConditionalStatementCheck;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println("Please enter the number to check number is armstrong or not");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(isArmstrongNumber(num)){
            System.out.println("Is a Armstrong number");

        }
        else {
            System.out.println("Is not a Armstrong number");
        }

        scanner.close();
    }


    public static boolean isArmstrongNumber(int num){
        int originalNumber = num;
       int temp = num;
       int digitCount =0;
       int sum =0;
       while(temp!=0){
           temp = temp / 10;
           digitCount++;
       }
       temp = num;
       while( temp > 0 ){

          int digit = temp % 10;
           sum = sum + (int)Math.pow(digit,digitCount);
           temp = temp / 10 ;
       }
        return originalNumber ==sum;
    }
}
