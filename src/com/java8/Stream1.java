package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
		
		
		List<Integer> al=new ArrayList();
		al.add(10);
		al.add(23);
		al.add(34);
		al.add(45);
		al.add(28);
		al.add(31);
		System.out.println("Actual List : "+al);
		
		List l2=al.stream().filter(i->i%2==0).collect(Collectors.toList());  //Filter (predicate)
		
		System.out.println("Even number From List "+l2);
		
		List l3=al.stream().map(i->i+5).collect(Collectors.toList());       // Map (function)
		
		System.out.println("Added +5 "+l3);
		
		List l4=al.stream().sorted().collect(Collectors.toList());  //sorted method without ant parameter default shorting
		
		System.out.println("Default shorting "+l4);
		
	//	Comparator<Integer> c=((i1,i2)->i1>i2?-1:i1<i2?1:0);  //we can pass the c also in shorted
		
		List l5 =al.stream().sorted((i1,i2)->i1>i2?-1:i1<i2?1:0).collect(Collectors.toList());  //customized Shoring 
		
		System.out.println("customize shorting "+l5);
		
		long count =al.stream().filter(p->p>30).count();
		
		System.out.println("Number > then 30 -> "+count);
		
		Integer min =al.stream().min((i1,i2)->i1>i2?1:i1<i2?-1:0).get(); //min
		
		System.out.println(min);
		
		Integer max =al.stream().max((i1,i2)->i1>i2?1:i1<i2?-1:0).get(); //max
		
		System.out.println(max);
		
		al.stream().forEach(System.out::println);
		Consumer<Integer> c= i->{
			i=i+1;
			System.out.println(i);
		};
		
		al.stream().forEach(c);     //FoR Each with consumer
		
		
		
	}

}
