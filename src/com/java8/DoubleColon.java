package com.java8;

public class DoubleColon {   //With method reference
	
	public static void main(String[] args) {
		
		
		Inteface1 i=(a,b) -> System.out.println("Sum is "+ (a+b));  // Normal Lamda expression 
		i.sum(10, 23);
		
		Inteface1 i2=DoubleColon::add;     //Static method i:e with class name if no static then with Object 
		//parameter should be same as sum method for add
		
		i2.sum(10, 200);
		
		
	}
	
	public static void add(int r,int s)
	{
		System.out.println("Sum is from DoubleColon "+ (r+s));
	}

}
