package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp=new Employee(67,"Vijay","DBG",654);
		Employee emp2=new Employee(32,"Ajay","Agara",178);
		Employee emp3=new Employee(7,"Zanny","Delhi",1097);
		Employee emp4=new Employee(25,"Hareesh","Asaam",786);
		
		
	//	List<Employee> li=new ArrayList<Employee>();
		TreeSet<Employee> li = new TreeSet<Employee>(new SalSort());
		li.add(emp);
		li.add(emp2);
		li.add(emp3);
		li.add(emp4);
		System.out.println(li);
		/*
		 * //Collections.sort(li); Collections.sort(li,new NameSort());
		 * System.out.println("After Sorting of EMP by Name"); System.out.println(li);
		 * //System.out.println(emp);
		 */		
	}
	
	

}
