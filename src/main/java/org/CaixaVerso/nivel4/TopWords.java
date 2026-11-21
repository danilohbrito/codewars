package org.CaixaVerso.nivel4;

import java.util.List;

import java.util.*;
import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TopWords {

    public static List<String> top3(String s) {

        s = s.toLowerCase(); //ignoring case

        Pattern pattern = Pattern.compile("[a-z']*?[a-z][a-z']*");
        Matcher matcher = pattern.matcher(s);

        Map<String, Long> result = matcher.results()
                .map(MatchResult::group)
                .collect(Collectors.groupingBy( Function.identity(), Collectors.counting() ));

        List<String> top3 = result.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();


        return top3;
    }
}

/**
 *  NAO ENVIADO, PQ SINDA FALTA ENTENDER melhor algumas coiass, como regex
 */

// https://www.codewars.com/kata/51e056fe544cf36c410000fb/train/java