package org.example.D900;

import java.util.Scanner;

//1475B
public class NewYearNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfTests= scan.nextInt();
        for (int i=0;i<numOfTests;i++){
            int num = scan.nextInt();

            int timesOf2020 = num /2020;
            int remaining = num%2020;

            System.out.println(remaining<=timesOf2020? "Yes":"No");
        }
    }
}
