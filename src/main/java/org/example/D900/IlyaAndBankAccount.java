package org.example.D900;

import java.util.Scanner;

//313A
public class IlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n>=0){
            System.out.println(n);
        }else {
            n*=-1;
            int lastDigit = n%10;
            int afterRemoveLast = n/10;
            int x = n/100;
            int afterRemoveBeforeLast = x*10+lastDigit;
            System.out.println(-1*Math.min(afterRemoveLast,afterRemoveBeforeLast));
        }



    }
}
