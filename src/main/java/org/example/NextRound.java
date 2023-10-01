package org.example;

import java.util.Scanner;

//158A
public class NextRound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, k, count;
        n = scan.nextInt();
        k = scan.nextInt();
        count = 0;
        int[] arr = new int[n];

        //getting array of scores
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i]>0 && arr[i] >= arr[k-1])
                count++;
        }
        System.out.println(count);

    }
}
