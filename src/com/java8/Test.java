package com.java8;

class Test implements DefInter,Int1{

	@Override
	public void m1() {
		System.out.println("I am M1 method");
		
	}

	@Override
	public void m3() {
		
		DefInter.super.m3();
	}

	public static void main(String[] args) {
		
		System.out.println("main hello");
		Test t=new Test();
		
		t.m3();
		
		
	}
	
}