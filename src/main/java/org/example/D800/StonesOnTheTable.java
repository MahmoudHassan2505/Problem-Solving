package org.example.D800;

import java.util.Scanner;

//266A
public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfColor = scan.nextInt();
        String row = scan.next();
        char current;
        char next;
        int count =0;
        for (int i=0;i<numOfColor-1;i++){
            current = row.charAt(i);
            next = row.charAt(i+1);
            if (current==next){
                count++;
            }
        }

        System.out.println(count);

    }
}
