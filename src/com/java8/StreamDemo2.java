package com.java8;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {

    public static void main(String[] args) {

        List<Integer> fullList= Arrays.asList(10,12,33,13,20,21,24);

        fullList.stream().filter(e->e%2 ==0).forEach(e-> System.out.print(e +","));
    }
}
