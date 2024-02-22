package org.example.D800;

import java.util.Scanner;

//112A
public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextLine().toLowerCase().compareTo(scanner.nextLine().toLowerCase());
        if (x<0){
            System.out.println(-1);
        }else if (x>0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
