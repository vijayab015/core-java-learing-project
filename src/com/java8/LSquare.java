package com.java8;

import java.util.function.*;;

public class LSquare {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(5));
		
	}

	
}
