package com.java8;

public class Lamda1 {
	
	@FunctionalInterface
	public interface interf
	{
		public void m1(int a,int b);
	}
	public static void main(String[] args) {
		
		interf i=(a,b)->System.out.println(a+b);
		i.m1(10, 20);
	}

}
