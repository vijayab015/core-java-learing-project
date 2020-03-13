package com.th;

public class ObjectAdd extends ABC{
	static int z=100;
	public static void main(String[] args) {
		ObjectAdd o=new ObjectAdd();
		o.m1();
		System.out.println(a);
	}
	public void m1()
	{
		System.out.println(ObjectAdd.z);
		System.out.println(b);
	}
	

}
class ABC
{
	static int a=10;
	int b=20;
	}
