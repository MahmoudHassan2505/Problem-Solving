package org.example.D900;

import java.util.Scanner;

//474A
public class Keyboard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String keyboard ="qwertyuiop[]asdfghjkl;\'zxcvbnm,./";
        String output="";
        String direction = scan.next().toUpperCase();
        String input = scan.next();
        if (direction.equals("R")){
            for (int i =0;i<input.length();i++){
                char x= input.charAt(i);
                int indexOfX = keyboard.indexOf(x);
                output+=keyboard.charAt(indexOfX-1);
            }
        }else {
            for (int i =0;i<input.length();i++){
                char x= input.charAt(i);
                int indexOfX = keyboard.indexOf(x);
                output+=keyboard.charAt(indexOfX+1);
            }
        }

        System.out.println(output);
    }
}
