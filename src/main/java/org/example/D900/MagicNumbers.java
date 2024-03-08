package org.example.D900;

import java.util.Scanner;

//320A
public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (input.length()>0){
            if (input.startsWith("144")){
                input = input.substring(3);

            }else if (input.startsWith("14")){
                input = input.substring(2);

            }else if (input.charAt(0)=='1'){
                input = input.substring(1);

            }else {
                break;
            }
        }
        System.out.println(input.length()==0?"YES":"NO");
    }
}
