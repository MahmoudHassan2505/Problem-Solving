package org.example.D900;

import java.util.Arrays;
import java.util.Scanner;

//337A
public class Puzzles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int students = scan.nextInt();
        int puzzles = scan.nextInt();
        int minSubset = 20000;

        int[] pieces = new int[puzzles];

        for (int i = 0; i < puzzles; i++) {
            pieces[i] = scan.nextInt();
        }
        Arrays.sort(pieces);


        for (int i = 0; i <= puzzles - students; i++) {

            int min = pieces[i];
            int max = pieces[i];
            for (int j = i; j < i + students; j++) {

                if (min > pieces[j]) {
                    min = pieces[j];
                }
                if (pieces[j] > max) {
                    max = pieces[j];
                }

            }

            if (minSubset > max - min) {
                minSubset = max - min;

            }

        }

        System.out.println(minSubset);
    }
}

