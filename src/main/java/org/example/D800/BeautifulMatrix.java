package org.example.D800;

import java.util.Scanner;

//263A
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix= new int[5][5];

        for (int row = 0;row<5;row++){
            for (int col = 0; col<5;col++){
                if(scanner.nextInt() == 1){
                    System.out.println((Math.abs(2-row)+Math.abs(2-col)));
                }
            }
        }
    }
}
