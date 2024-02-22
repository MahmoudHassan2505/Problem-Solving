package org.example.D900;

import java.util.Scanner;

//96A
public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println((word.contains("1111111")||word.contains("0000000"))? "YES":"NO");
    }
}
