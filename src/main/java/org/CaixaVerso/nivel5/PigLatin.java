package org.CaixaVerso.nivel5;


public class PigLatin {


    public static String pigIt(String str) {

        String[] result = stringToArray(str);
        wordModification(result);

        return String.join(" ", result);
    }


    private static String[] stringToArray(String str){

        return str.split("\\s+");
    }

    private static void wordModification(String[] str){

        for(int i = 0; i < str.length; i++){

            if(Character.isLetter(str[i].charAt(0))){

                char firstLetter = str[i].charAt(0);
                str[i]= str[i].substring(1) + firstLetter + "ay";
            }
        }
    }

}

// https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java