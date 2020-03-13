package com.test;

public class ArraySort {
	public static void main(String[] args) {

		int a[] = { 7, 8, 10, 9, 1, 0, 3, 6 };
		 System.out.println(a.length);
		 System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp;
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);

		}

	}

}
