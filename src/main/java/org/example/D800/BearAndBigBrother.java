package org.example.D800;

import java.util.Scanner;

//791A
public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limakWeight = scan.nextInt();
        int bobWeight = scan.nextInt();
        int count =0;
        while (bobWeight>=limakWeight){
            bobWeight*=2;
            limakWeight*=3;
            count++;
        }
        System.out.println(count);

    }
}

