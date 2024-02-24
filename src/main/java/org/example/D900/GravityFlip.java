package org.example.D900;

import java.util.Arrays;
import java.util.Scanner;

//405A
public class GravityFlip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int columns = scan.nextInt();
        int [] nums = new int[columns];

        for (int i =0; i<columns; i++){
            nums[i]= scan.nextInt();
        }

        Arrays.sort(nums);

        for(int x : nums){
            System.out.print(x+" ");
        }
    }
}
