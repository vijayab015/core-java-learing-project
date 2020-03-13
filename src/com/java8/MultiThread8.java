package com.java8;

public class MultiThread8 {

	public static void main(String[] args) {
		
		// argument is not required for run method () so empty
		// Runnable is functional Interface so we can use Lamda expression 
		
		Runnable r = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Child Thread");
			}
		};

		Thread t = new Thread(r);
		t.start();
		
		for(int j=0;j<=10;j++)
		{
			System.out.println("main thread");
		}

	}
}
