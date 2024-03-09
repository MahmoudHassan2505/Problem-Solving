package org.example.D800;

import java.util.Scanner;

//546A
public class SoldierAndBananas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int initialCost=scan.nextInt();
        int initialMoney=scan.nextInt();
        int numOfBanana=scan.nextInt();

        int totalCost=numOfBanana*(numOfBanana+1)/2*initialCost;


        System.out.println(Math.max(0,totalCost-initialMoney));

    }
}
