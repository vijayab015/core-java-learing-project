package com.th;

public class ThreadDemo extends Thread{
	public static void main(String[] args) 
	
	{
		ThreadDemo t=new ThreadDemo();
		t.start();
		System.out.println("hello");
		
	}
	public void run()
	{
		System.out.println("Hi");
	}
	
	

}
