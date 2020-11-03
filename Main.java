//Created By: Sam Lawton
//Created: 11/03/2020
//This program checks to see if a number given is divisible by 3,5, 3 and 5, or none of these.

package com.codewithsam;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();

	if (number % 3 ==0 && number % 5 ==0)
        System.out.println("FizzBuzz");
	else if (number % 3 == 0)
        System.out.println("Buzz");
	else if (number % 5 ==0)
        System.out.println("Fizz");
	else
        System.out.println(number);

    }
}
