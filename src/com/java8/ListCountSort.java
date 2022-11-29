package com.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListCountSort {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,2,5,5,5,1,1,1,1,6,8,8);
        // 6 8 8 2 2 5 5 5 1 1 1 1

        Map<Integer,Long> coutList=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(coutList);

        LinkedHashMap<Integer,Long> sortedMap=new LinkedHashMap<>();
        coutList.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(m->sortedMap.put(m.getKey(),m.getValue()));
        System.out.println(sortedMap);
        Set s=sortedMap.keySet();

        System.out.println(s);
        for(int i=1;i<sortedMap.size();i++)
        {

        }

    }
}
