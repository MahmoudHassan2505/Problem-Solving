package org.example.D800;

import java.util.*;

//236A
public class BoyOrGirl {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();
        Set<Character> alphabet = new HashSet<>();
        for (char c : word.toCharArray()) {
            alphabet.add(c);
        }

        if (alphabet.size() % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");

    }
}
