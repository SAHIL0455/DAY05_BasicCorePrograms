package com.company.basicprogram;

import java.util.Objects;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter the word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        if (Objects.equals(word, "a") || Objects.equals(word, "e") || Objects.equals(word, "i") || Objects.equals(word, "o") || Objects.equals(word, "u")){
            System.out.println("This is Vowel");
        }else {
            System.out.println("This is Consonant");
        }
    }
}
