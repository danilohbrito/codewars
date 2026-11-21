package org.CaixaVerso.nivel6;

public class TransformToPrime {

    public static int minimumNumber(int[] numbers)
    {
        int soma = 0;
        int minimum = 0; // non-negative

        for(int number:numbers) {
            soma += number;
        }




        return 0; // Do your magic!
    }

    private static boolean primeNumber(int number) {
        if(number < 2) return false;

        if(number == 2) return true;
        if(number % 2 == 0) return false; // avoid test even numbers

        for(int i = 3; i*i  <= number; i += 2) {
            if(number % i == 0) return false;
        }

        return true;
    }


}
