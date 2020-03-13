package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpShorting {
	
	public static void main(String[] args) {
		
		
		List<Emp> l=new ArrayList();
		
		l.add(new Emp(12,"Vijay",19000.0));
		
		l.add(new Emp(100,"Alex",1200.0));
		l.add(new Emp(16,"Ajay",1300.25));
		l.add(new Emp(45,"XGen",4400.56));
		
		System.out.println(l.toString());
		
		
		 //Shorting by Emp Number
		Collections.sort(l,(e1,e2) ->(e1.empNum<e2.empNum)?-1:(e2.empNum>e2.empNum)?1:0);  
		
		System.out.println(l.toString());
		
		
		 //Shorting by Emp Name
		
		
		Collections.sort(l, (e1,e2) ->e1.empName.compareTo(e2.empName));
		
		System.out.println(l.toString());
		
		Collections.sort(l,(e1,e2) -> (e1.salary<e2.salary)?-1:(e1.salary>e2.salary)?1:0);
		
		System.out.println(l.toString());
		
		
		
		
		
		
	}
	

}

class Emp
{
	int empNum;
	Double salary;
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	String empName;
	Emp(int empNum,String empName,Double salary)
	{
		this.empNum=empNum;
		this.empName=empName;
		this.salary=salary;
	}
	
	public String toString()
	{
		return empNum +":" +empName +" :" +salary;
	}
	}
