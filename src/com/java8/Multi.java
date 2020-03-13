package com.java8;

public class Multi {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Hello");
			}

		};

		Thread t = new Thread(r);
		t.start();

	}

}
