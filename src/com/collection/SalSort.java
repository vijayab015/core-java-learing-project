package com.collection;

import java.util.Comparator;

public class SalSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int) (o1.getSal() - o2.getSal());
	}
	

}
