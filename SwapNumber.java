package com.company.basicprogram;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the Second Number");
        int secondNumber = sc.nextInt();
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("Swap the Two Number");
        System.out.println(firstNumber);
        System.out.println(secondNumber);
    }
}
