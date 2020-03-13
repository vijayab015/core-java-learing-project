package com.collection;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String city;
	private long sal;
	
	
	public  Employee()
	{
		
	}
	
	public  Employee(int id,String name,String city,long sal)
	{
		this.id=id;
		this.city=city;
		this.name=name;
		this.sal=sal;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	
	
	public String toString()
	{
		return "Employee : " +id + "-" +name +" - " +city + " - " +" -" +sal +"\n";
				
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.id- o.id;
	}

	
	

}
