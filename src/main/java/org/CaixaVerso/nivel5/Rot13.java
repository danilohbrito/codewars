package org.CaixaVerso.nivel5;

public class Rot13 {



    public static String rot13(String str) {

        String strCodified = "";
        for(int i = 0; i < str.length(); i++){
            strCodified += codify13(str.charAt(i));
        }

        return strCodified;
    }


    private static char codify13(char character) {

        if(character >= 'a' && character <= 'z') return (char) ('a' +( character - 'a' + 13 ) % 26);

        if(character >= 'A' && character <= 'Z') return (char) ('A' +( character - 'A' + 13 ) % 26);

        return character;
    }

}
