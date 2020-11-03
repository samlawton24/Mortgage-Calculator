//Sam Lawton
//Created 11/02/2020
//This program calculates monthly mortgages payments with the given info: Principal, APR, Period (Years)

package com.codewithsam;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte Months_In_Year =12;
        final byte Percent = 100;

        System.out.println("Monthly Mortgage Calculator");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int Principal = scanner.nextInt();

        System.out.print("APR: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / Percent / Months_In_Year;

        System.out.print("Years: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * Months_In_Year;

        double mortgage = Principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        // Calculates Mortgage

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);



    }
}
