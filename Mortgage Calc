//Sam Lawton
//Created 11/02/2020
//This program calculates monthly mortgages payments with the given info: Principal, APR, Period (Years)

package com.codewithsam;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte Months_In_Year =12;
        final byte Percent = 100;
        int Principal = 0;
        float annualInterest = 0;
        float monthlyInterest = 0;
        byte years = 0;
        int numberOfPayments = 0;

        System.out.println("Monthly Mortgage Calculator");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            Principal = scanner.nextInt();
            if (Principal >= 1000 && Principal <= 1_000_000)
            break;
            System.out.println("Please enter a number between 1000 and 1000000");

        }

        while (true) {
            System.out.print("APR: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30) {
                monthlyInterest = annualInterest / Percent / Months_In_Year;
                break;
            }
            System.out.println("Please enter a number between 1 and 30");
        }

        while (true) {
            System.out.print("Years: ");
            years = scanner.nextByte();
            if (years > 1 && years < 30) {
                numberOfPayments = years * Months_In_Year;
                break;
            }
            System.out.println("Please enter a number greater than 1 and less than 30");
        }

        double mortgage = Principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        // Calculates Mortgage

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);



    }
}
