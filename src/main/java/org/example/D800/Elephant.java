package org.example.D800;

import java.util.Scanner;
//617A
public class Elephant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double position = scan.nextDouble();
        System.out.println((int)Math.ceil(position/5));
    }
}
