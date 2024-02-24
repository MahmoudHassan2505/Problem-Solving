package org.example.D900;

import java.util.Scanner;

//318A
public class EvenOdds {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long index = scan.nextLong();
        long pivot = (long) Math.ceil((double)n/2);

        if(index<=pivot){
            System.out.println(2*index-1);
        }else {
            System.out.println((index-pivot)*2);
        }
    }
}
