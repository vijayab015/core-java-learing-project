package com.java8;

public class Student {
	
	public Student()
	{
		System.out.println("Constuctor refrence");
	}
	
	public int rollNum;
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String name;
	public int marks;
	
	public Student(int rollNum,String name,int marks)
	
	{
		this.marks=marks;
		this.rollNum=rollNum;
		this.name=name;
	}
	

}
