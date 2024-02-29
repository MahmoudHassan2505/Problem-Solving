package org.example.D900;

import java.util.Arrays;
import java.util.Scanner;

//34B
public class Sale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfTVs = scan.nextInt();
        int numBobCanCarry = scan.nextInt();

        int [] tvsPrices = new int[numOfTVs];
        int sum=0;

        for (int i =0;i<numOfTVs;i++){
            tvsPrices[i]= scan.nextInt();
        }
        Arrays.sort(tvsPrices);

        for (int i=0;i<numBobCanCarry;i++){
            if (tvsPrices[i]>0){
                break;
            }
            sum+=Math.abs(tvsPrices[i]);
        }
        System.out.println(sum);
    }
}
