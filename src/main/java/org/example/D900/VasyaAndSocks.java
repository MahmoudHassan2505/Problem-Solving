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
        int r =0;
        int newX=n;
        int newR=0;
        while((newX+newR)/m >0){
            newX=(x+r)/m;
            newR=(x+r)%m;

            days+=newX;
            x=newX;
            r=newR;
        }
        System.out.println(days);
    }
}

//I used modulus because if there is 5 socks then after it finished then will be 2 new one
// and the last day will be ignored so we use modulus to save it for future