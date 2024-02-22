package org.example;

import java.util.Arrays;
import java.util.Scanner;

//339A
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] num = scan.nextLine().split("\\+");
        Arrays.sort(num);
        System.out.println(String.join("+",num));
    }

}
