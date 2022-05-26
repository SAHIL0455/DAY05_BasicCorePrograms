package com.company.basicprogram;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter the Number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mul = 1;
        if (num >31){
            System.out.println("Only provides less than 31");
        }else {
            for (int i = 1; i<num; i++){
                mul = mul * 2;
            }
            System.out.println("2 power of " + num +" = "+mul);
        }
    }
}
