package org.example.D900;

import java.util.Scanner;

//451A
public class GameWithSticks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        int col = scan.nextInt();



        if (Math.min(row,col)%2 !=0){
            System.out.println("Akshat");
        }else {
            System.out.println("Malvika");
        }
    }

}
//With some Help