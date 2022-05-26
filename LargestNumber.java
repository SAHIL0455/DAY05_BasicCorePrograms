package com.company.basicprogram;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter the First Number");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        System.out.println("Enter the second Number");
        int second = sc.nextInt();
        System.out.println("Enter the third Number");
        int third = sc.nextInt();
        if ( first>second && first>third){
            System.out.println("largest Number is = "+first);
        } else if (second>first && second>third) {
            System.out.println("Largest Number is = "+second);
        } else if (third>first && third>second) {
            System.out.println("Largest Number is = "+third);
        }
    }
}