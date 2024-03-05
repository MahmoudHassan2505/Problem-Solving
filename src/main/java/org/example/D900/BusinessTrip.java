package org.example.D900;

import java.util.Arrays;
import java.util.Scanner;

//149A
public class BusinessTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        int[] months = new int[12];
        for (int j = 0; j < 12; j++) {
            months[j] = scan.nextInt();
        }

        Arrays.sort(months);

        int i = 11;
        while (i>=0&&k>0){
            k-=months[i--];
        }
        System.out.println(k>0?-1:11-i);


    }
}
