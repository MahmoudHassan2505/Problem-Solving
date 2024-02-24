package org.example.D900;

import java.util.Scanner;

//580A
public class KefaFirstSteps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = scan.nextInt();
        int count = 1;
        int maxSeq=1;
        long prev = scan.nextLong();

        for (int i = 1; i < days; i++) {

            long next = scan.nextLong();

            if (prev <= next) {
                count++;
            } else {

                count = 1;
            }
            prev = next;
            if (count>maxSeq){
                maxSeq = count;
            }


        }
        System.out.println(maxSeq);
    }
}
