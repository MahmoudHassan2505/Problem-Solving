package org.example.D900;

import java.util.*;

//977B
public class TwoGram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size =scan.nextInt();
        String input= scan.next();
        String current;
        int temp=0;
        String output ="";
        Map<String,Integer> grams = new HashMap<>();

        for (int i =0;i<size-1;i++){
            current = input.substring(i,i+2);
            grams.put(current,0);
        }
        int count;
        for (int i =0;i<size-1;i++){
            current = input.substring(i,i+2);
            count=grams.get(current)+1;
            grams.put(current,count);
            if (temp<=count){
                temp=count;
                output=current;
            }
        }

        System.out.println(output);
    }
}
