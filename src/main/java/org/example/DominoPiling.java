package org.example;

import java.util.Scanner;
//50A
public class DominoPiling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int area = 1;
        area*= scanner.nextInt();
        area*= scanner.nextInt();

        System.out.println((int)(area/2));

    }
}
