package com.test;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, "ABC");
		hm.put(2,"XYZ");
		hm.put(3,"KLM");
		hm.put(4,"ABC");
		hm.put(5,"KLM");
		hm.put(6, "ABC");
		System.out.println(hm.get(4));
		System.out.println(hm);
		
		Test11 t1=new Test11();
		t1.m7();
	}
}