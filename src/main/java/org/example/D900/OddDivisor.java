package org.example.D900;

import java.util.Scanner;

//1475A
public class OddDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfTestCase = scan.nextInt();

        for (int i =0;i<numberOfTestCase;i++){
            long num = scan.nextLong();
            //if number is even then divide by 2 until get the 1 or the odd factor of number
            while (num%2==0){
                num/=2;
            }
            if (num>1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }


    }
}