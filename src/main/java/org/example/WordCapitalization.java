package org.example;

import java.util.Scanner;

//281A
public class WordCapitalization {
    public static void main(String[] args) {
        String word = new Scanner(System.in).nextLine();
        System.out.println((word.charAt(0)+"").toUpperCase()+ word.substring(1));
    }
}
