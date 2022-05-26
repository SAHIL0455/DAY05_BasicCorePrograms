package com.company.basicprogram;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("How Many Time Coin is Toss");
        Scanner sc = new Scanner(System.in);
        int flipCoin = sc.nextInt();
        int head = 0;
        if (flipCoin <= 0){
            System.out.println("Number of Flip do not zero or less than zero");
        }else {
            for (int i=0; i<=flipCoin; i++){
                if (Math.random() < 0.5){
                    head++;
                }
            }
            double headPercentage = head * 100 / flipCoin;
            System.out.println("Percentage of head is = "+headPercentage);
            System.out.println("Percentage of tail is = "+ (100 - headPercentage));
        }
    }
}