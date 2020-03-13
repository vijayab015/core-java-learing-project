package com.th;

public class Abst implements AB
{
	public static void main(String[] args) 
	{
		Abst a=new Abst();
		a.m2();
	}
	/*public void  m3()
	{
		System.out.println("m3");
	}*/
	public void abs2()
	{
		System.out.println("abs2");
	}
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
	

}
interface  AB
{
	int a=10;
	public void  m1();
	public default void m2()
	{
		System.out.println("Interface Method");
	}
	public void  m3();
	
	}
abstract class  ABS
{
	int s=100;
	public void abs1()
	{
		System.out.println("ABS!");
		
	}
	public abstract void abs2();
	public abstract void abs3();
	}