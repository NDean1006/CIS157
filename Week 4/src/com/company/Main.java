/*
CIS 157
Assignment a4 -- Computing Prime NumbersAssignment a4 -- Computing Prime Numbers
Nicholas Dean
 */


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter first number: ");

            int var1 = Integer.parseInt(scan.next());
            System.out.println("Enter second number: ");
            int var2 = Integer.parseInt(scan.next());

            if (var2 < var1) {
                int temp = var1;
                var1 = var2;
                var2 = temp;
            } // ensures rang is a positive number

            int num = var1;
            int temp;
            int count = 0;

            if (num < 2) {
                num = 2;
            } // 0 and 1 are not prime

            boolean isPrime = true;
            while (num <= var2) {

                for (int i = 2; i <= num / 2; i++) {
                    temp = num % i;
                    if (temp == 0) {
                        isPrime = false;
                    } // throw false to IsPrime if num is divisible

                } // loop to generate divisor

                if (isPrime) {
                    System.out.println(count + 1 + ". " + num);
                    count++;
                } // if no false has bee thrown in the for loop print prime number

                // reset "isPrime" bool
                isPrime = true;

                // increment loop counter "num"
                num++;

            } // loop

            if (count == 0) {
                System.out.println("No prime number in range.");
            } // no prime message

        }// continuous while loop
    } // main method
}// Main Class