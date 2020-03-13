package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListWithLamda {
	
	public static void main(String[] args) {
		
		
		List<Integer> l=new ArrayList();
		
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(25);
		l.add(28);
		l.add(16);
		
		System.out.println(l);
		
		Comparator<Integer> c= (I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		
		Collections.sort(l,c);
		
		l.stream().forEach(System.out::println);
		List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(l2);
		
		
	}

}
