package com.java8;

public interface DefInter {
	public void m1();
	
	static void m2()
	{
		System.out.println("Static method");
	}
	default void m3()
	{
		System.out.println("Default M3 of DefInter");
	}
	
	

} 


