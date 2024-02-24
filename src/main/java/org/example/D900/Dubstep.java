package org.example.D900;

import java.util.Scanner;

//208A
public class Dubstep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        String [] output =  input.split("WUB");

        for (String x: output){
            if (!x.equals("")){
                System.out.print(x+" ");
            }
        }
    }
}
