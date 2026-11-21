package org.CaixaVerso.nivel4;

import java.util.TreeSet;

public class SumOfDivided {
    public static String sumOfDivided(int[] l) {

        String result = "";
        
        TreeSet<Integer> allDivisors = new TreeSet<>();
        allDivisors = allPrimeDivisors(l);
        
        for (int div : allDivisors) {
            result += divSum(div, l);
        }

        return result;
    }

    private static String divSum(int divisor, int[] l) {

        int sum = 0;

        for(int i = 0; i < l.length; i++) {
            if( l[i] % divisor == 0 ) sum += l[i];
        }

        return "(" + divisor + " " + sum + ")";
    }

    private static TreeSet<Integer> allPrimeDivisors(int[] numbers){

        TreeSet<Integer> allDivisors = new TreeSet<>();

        for (int number : numbers) {
            allDivisors.addAll(primeDivisors(number));
        }

        return allDivisors;
    }

    private static TreeSet<Integer> primeDivisors(int number) {
        TreeSet<Integer> divisors = new TreeSet<>();

        number = Math.abs(number);

        if(number % 2 == 0) {
            divisors.add(2);
            while(number % 2 == 0) {
                number /= 2;
            }
        }

        for( int i = 3; i*i <= number; i += 2) {
            if(number % i == 0) {
                divisors.add(i);
                while(number % i == 0){
                    number /= i;
                }
            }
        }

        if(number > 1) divisors.add(number);

        return divisors;
    }
}

    // https://www.codewars.com/kata/54d496788776e49e6b00052f/train/java


/**
 *
 * =================================================  BEST SOLUTION  =================================================
 *
 * import java.util.Arrays;
 * import java.util.List;
 * import java.util.stream.Collectors;
 * import java.util.stream.IntStream;
 *
 * public class SumOfDivided {
 *
 *     public static String sumOfDivided(int[] l) {
 *         final int maxValue = Arrays.stream(l).map(num -> Math.abs(num)).max().getAsInt();
 *         return eratosteneSieve(maxValue).stream()
 *                 .reduce("",
 *                         (resultString, primeNum) -> {
 *                             List<Integer> divisibleNum = Arrays.stream(l)
 *                                                                .filter(num -> num % primeNum == 0)
 *                                                                .boxed()
 *                                                                .collect(Collectors
 *                                                                .toList());
 *
 *                             return divisibleNum.size() > 0
 *                                     ? resultString + String.format("(%d %d)", primeNum, divisibleNum.stream().mapToInt(Integer::intValue).sum())
 *                                     : resultString;
 *                         },
 *                         (not, used) -> null);
 *     }
 *
 *     public static List<Integer> eratosteneSieve(final int x) {
 *         final List<Integer> candidates = IntStream.rangeClosed(2, x).boxed().collect(Collectors.toList());
 *         return candidates.stream()
 *                 .filter(num -> num <= Math.sqrt(x))
 *                 .reduce(candidates,
 *                         (resList, currNum) -> resList.stream()
 *                         .filter(num -> num % currNum != 0 || num.equals(currNum))
 *                         .collect(Collectors.toList()),
 *                         (not, used) -> null);
 *     }
 * }
 */