package com.ghostfacedlabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This application will print the Fibonacci Sequence to the Nth decimal.");
        System.out.println("------------------------------------");

        while (true) {
            System.out.println();
            System.out.print("Please provide a number: ");
            String providedValue = scanner.nextLine();
            int number;

            try {
              number = Integer.parseInt(providedValue);
            } catch (NumberFormatException n) {
                System.out.println("Must be a valid number");
                continue;
            }

            printFibonacci(number);
            break;

        }
    }

    public static void printFibonacci (int num) {
        int count = 0;
        long number = 0;
        long second = 1;

        while (count < num)  {
            System.out.println(number);
            long helper = number;
            number = number + second;
            second = helper;
            count++;
        }

    }
}
