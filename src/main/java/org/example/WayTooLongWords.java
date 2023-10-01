package org.example;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String word ="";
        for (int i =0;i<input;i++){
            word = scan.next();
            if (word.length()>10){
                System.out.println(""+word.charAt(0)+(word.length()-2)+word.charAt(word.length()-1));
            }else{
                System.out.println(word);
            }
        }
    }
}
