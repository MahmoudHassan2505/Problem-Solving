package org.example.D800;

import java.util.Scanner;

//282A
public class Bit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        int n = scan.nextInt();

        for (int i = 0; i<=n; i++) {
            String input = scan.nextLine();
            if(input.contains("++")){
                result++;
            }
            if(input.contains("--")){
                result--;
            }
        }
        System.out.println(result);
    }
}
