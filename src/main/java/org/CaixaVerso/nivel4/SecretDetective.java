package org.CaixaVerso.nivel4;

import com.sun.source.util.Trees;

import javax.security.auth.callback.CallbackHandler;
import java.util.Collections;
import java.util.TreeSet;

public class SecretDetective {

    public String recoverSecret(char[][] triplets) {

        TreeSet<Character> letters = allLetters(triplets);
        int numberLetters = letters.size();

        // ache primeira e ultima
        // e agora?


        return "";
    }


    private static Character firstLetter (char[][] triplets) {

        TreeSet<Character> possibleFirstLetters = allLetters(triplets);

        for(char[] line : triplets) {
            for (int j = 1; j < line.length; j++) {
                // possibleFirstLetter is only on line[0]
                if(possibleFirstLetters.contains(line[j])) {

                    possibleFirstLetters.remove(line[j]);

                }
            }
        }

        if(possibleFirstLetters.size() != 1) return '!'; // Repeated letters

        return possibleFirstLetters.getFirst();
    }

    private static Character lastLatter (char[][] triplets) {

        TreeSet<Character> possibleLastLatters = allLetters(triplets);

        for(char[] line : triplets) {
            for (int j = 0; j < line.length - 1; j++) {
                if(possibleLastLatters.contains((line[j]))) possibleLastLatters.remove(line[j]);
            }
        }

        if(possibleLastLatters.size() != 1) return '!'; // Repeated letters

        return possibleLastLatters.getFirst();
    }

    private static TreeSet<Character> allLetters(char[][] triplets) {

        TreeSet<Character> allLetters = new TreeSet<Character>();
        for(char[] line : triplets) {
            for (char c : line) {
                allLetters.add(c);
            }
        }

        return allLetters;
    }


}

// Collections


// char[][] = char [triplet] [l1, l2, l3]

// first letter - no one come befor


// https://www.codewars.com/kata/53f40dff5f9d31b813000774/train/java