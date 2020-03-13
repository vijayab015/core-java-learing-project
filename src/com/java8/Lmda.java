package com.java8;

public class Lmda {
	public static void main(String[] args) {
		
		inter i=(a,b) ->System.out.println(a+b);
		i.add(10, 2);
		
	}
	
	public interface inter
	{
		public void add(int a,int b);
		
		
	}

}
