package org.example.D800;

import java.util.Scanner;

//231A
public class Team {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int problemCount =0;
        int vote = 0;

        for (int i =0;i<input;i++){
            vote=0;
            for (int j = 0;j<3;j++ ){
                vote+=scan.nextInt();
            }
            if (vote>=2){
                problemCount++;
            }
        }
        System.out.println(problemCount);
    }
}
