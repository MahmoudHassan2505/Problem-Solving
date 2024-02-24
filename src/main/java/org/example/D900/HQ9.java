package org.example.D900;

import java.util.Scanner;

//133A
public class HQ9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.next().matches(".*[HQ9].*")?"YES":"NO");
    }
}
