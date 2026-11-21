package org.CaixaVerso.nivel8;

public class Cookie {
    public static String cookie(Object x) {

        String phrase = "Who ate the last cookie? It was ";

        if(x.getClass().getSimpleName().equals("String")) {
            return phrase + "Zach!";
        } else if(x.getClass().getSimpleName().equals("Double") ||
                  x.getClass().getSimpleName().equals("Integer")) {

            return phrase + "Monica!";
        } else {
            return phrase + "the dog!";
        }
    }
}