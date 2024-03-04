package org.example.D900;

import java.util.Scanner;

//460A
public class VasyaAndSocks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int m = scan.nextInt();

        int days = n;
        int x = n;
        
        while(x/m >0){
            x/=m;
            days+=x;
        }
        System.out.println(days);
    }
}
