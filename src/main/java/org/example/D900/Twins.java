package org.example.D900;

import java.util.Arrays;
import java.util.Scanner;

//160A
public class Twins {
    public static void main(String[] args) {
        //Football
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        int [] coins = new int[count];

        for (int i =0; i<count;i++){
            coins[i]=scan.nextInt();
        }

        Arrays.sort(coins);
        int sumOfPicked = 0;

        for (int i = coins.length-1;i>=0;i--){
            sumOfPicked+=coins[i];
            int sumOfRest = 0;
            for (int j =0;j<i;j++){
                sumOfRest+=coins[j];
            }
            if (sumOfPicked>sumOfRest){
                System.out.println(count-i);
                break;
            }
        }


    }
}
