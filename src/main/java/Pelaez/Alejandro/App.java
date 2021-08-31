/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        System.out.print("How many euros are you exchanging? ");
        Scanner input = new Scanner(System.in);
        float euros = input.nextFloat();
        System.out.print("What is the exchange rate? ");
        float exRate = input.nextFloat();
        float usDollars = euros * exRate;
        System.out.printf("%.0f euros at an exchange rate of %.4f is\n%.2f U.S dollars.\n", euros, exRate, usDollars);
    }
}
