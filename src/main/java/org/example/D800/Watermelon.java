package org.example.D800;

import java.util.Scanner;
//4A
public class Watermelon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if(input<=2){
            System.out.println("NO");
            return;
        }

        if(input%2==0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}