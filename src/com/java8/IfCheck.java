package com.java8;

import java.util.Scanner;

public class IfCheck {

	
	public static void main(String[] args) {
		
		
		int a;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		a=scn.nextInt();
		
	
		
		System.out.println("Number is " +a);
		
		System.out.println((a<15)?"Before your BirthDay":(a==15)?"BirthDay":"After Your BirthDay");
	}
}
