package org.example.D900;

import java.util.Scanner;

//556A
public class CaseOfTheZerosAndOnes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        String input = scan.next();

        int numOfOnes=0;
        int numOfZeros =0;

        for (int i=0;i<length;i++){
            if(Integer.parseInt(""+input.charAt(i)) ==1){
                numOfOnes++;
            }else {
                numOfZeros++;
            }
        }

        System.out.println(length-2*Math.min(numOfOnes,numOfZeros));
    }
}
