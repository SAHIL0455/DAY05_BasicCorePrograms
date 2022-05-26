package com.company.basicprogram;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        System.out.println("Enter the Divident");
        Scanner sc = new Scanner(System.in);
        int divident = sc.nextInt();
        System.out.println("Enter the Divisor");
        int divisor = sc.nextInt();
        int quotient = divident / divisor;
        int remainder = divident % divisor;
        System.out.println("Quotient is = "+quotient);
        System.out.println("Remainder is = "+remainder);
    }
}
