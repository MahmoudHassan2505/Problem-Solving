package org.example.D900;

import java.util.Scanner;

//1374B
public class Multiplyby2_divideby6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfTests = scan.nextInt();
        long num;
        int moves;

        for (int i =0;i<numOfTests;i++){
            moves =0;
            num = scan.nextLong();
            while (num >1){
                if (num%6==0){
                    num/=6;
                    moves++;
                }else if((num*2)%6==0){
                    num*=2;
                    moves++;
                }else {
                    moves = -1;
                    break;
                }

            }
            System.out.println(moves);
        }

    }
}

/**
 * Idea :
 *          The Number must be included only 2,3 in the set of Prime factorization
 *          and the exponential of 3 is more than or equal  2
 **/