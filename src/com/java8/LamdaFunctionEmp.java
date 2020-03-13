package com.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaFunctionEmp {

	public static void main(String[] args) {

		Function<Student, String> f = s -> {

			int marks = s.getMarks();
			String grade = "";
			if (marks > 80)
				grade = "A";
			else if (marks > 60)
				grade = "B";
			else if (marks > 40)
				grade = "c";
			else
				grade = "Failed";
			return grade;

		};
		
		Predicate<Student> p=s1->s1.marks>60;
		Student[]s= {
				new Student(1,"Ajay",85),
				new Student(4,"Shekhar",67),
				new Student(7,"Shyan",56),
				new Student(9,"Vikash",48),
				new Student(14,"Blue",30)
				
		};
		
		for(Student s1:s)
		{
			if(p.test(s1))
					{
			System.out.println(s1.getName() +" :" +s1.getRollNum() +": " +f.apply(s1) );
			}
		}
		
	}

}
