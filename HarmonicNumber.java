package com.company.basicprogram;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double result = 0;
        if (num<= 0){
            System.out.println("Number is not valid");
        }else {
            while (num > 0) {
                result = result +(double) 1 / num;
                num--;
            }
        System.out.println("The value of Harmonic Number is " + result);
       }
    }
}