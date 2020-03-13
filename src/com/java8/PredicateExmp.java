package com.java8;

import java.util.function.Predicate;

public class PredicateExmp {
	public static void main(String[] args) {
		
		
		Predicate<Integer> p=i -> i>=10;
		System.out.println(p.test(20));
		
	String name[]= {"Vijay","Ajay","Tom","anil","xy","A"};
	Predicate<String> p1= s -> s.length()>3;
	
	for(String s1:name)
	{
		if(p1.test(s1))
		{
			System.out.println(s1);
		}
	}
		
	}

}
