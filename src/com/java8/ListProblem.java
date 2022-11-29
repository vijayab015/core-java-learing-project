package com.java8;

import Inter.Str;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListProblem {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 25,33, 5, 5, 4, 1);

        HashSet<Integer> hs = new HashSet<>();
//        System.out.println("Fining only duplicate element in LIST -> " + list.stream()
//                                                                        .filter(n -> !hs.add(n))
//                                                                        .collect(Collectors.toList()));

        String s = "aabccdde";

//        System.out.println("How many time what charter is -> " + Arrays.stream(s.split(""))
//                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));


       // System.out.println(list.stream().filter(i->String.valueOf(i).charAt(0)=='2').collect(Collectors.toList()));

       //list.stream().forEach(i-> System.out.println(i));

        System.out.println(list.stream().reduce(0,(a,b) ->a+b));

        list.stream().reduce(0,Integer::sum);


        System.out.println(list.stream().max(Integer::compare).get());

        list.stream().map(str->str+"").filter(str->str.startsWith("2")).collect(Collectors.toList());

        String input = "Java Hungry Blog Alive is Awesome";

        Character result = input.chars() //
                .mapToObj(s1 -> Character.toLowerCase(Character.valueOf((char) s1)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);

        System.out.println(Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
               .entrySet().stream()
               .filter(entry->entry.getValue()==1L)
                .map(entry->entry.getKey()).findFirst().get());





    }
}
