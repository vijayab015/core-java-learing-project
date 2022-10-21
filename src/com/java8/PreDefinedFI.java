package com.java8;

import Inter.Str;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefinedFI {

    //Function,Predicate,Consumer Supplier,


    public static void main(String[] args) {
        //T,R
        Function<String,Integer> function=s-> s.length();
        System.out.println(function.apply("TEST"));

        //T  return boolean
        Predicate<Integer> predicate=i -> i>=5;
        System.out.println(predicate.test(10));

        //T -> to print any-thing no return anything
        Consumer<String> consumer=s-> System.out.println(s);
        consumer.accept("I m accepting data");

        //R
        Supplier<String> supplier= ()->{
            String otp="";
            for(int i=0;i<=5;i++) {
                otp = otp + (int)(Math.random() * 10);
            }
            return otp;
        };

        System.out.println(supplier.get());



    }
}
