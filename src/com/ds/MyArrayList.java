package com.ds;

import java.awt.List;
import java.util.Arrays;

public class MyArrayList {

	static Object[] myStore;
	static int actSize = 0;

	public static void main(String a[]) 
	
	{
		MyArrayList ml=new MyArrayList();
		ml.add("Vijay");
		ml.add("Vijay2");
		ml.add("Vijay3");
		ml.add("Vijay4");
		ml.add("Vijay5");
		ml.add("Vijay6");
		System.out.println(ml.remove(2));
	}

	public MyArrayList() {
		myStore = new Object[10];
	}

	public Object get(int index) {
		if (index < actSize) {
			return myStore[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void add(Object obj) {
		if (myStore.length - actSize <= 5) {
			increaseListSize();
		}
		myStore[actSize++] = obj;
	}

	public Object remove(int index) {
		if (index < actSize) {
			Object obj = myStore[index];
			myStore[index] = null;
			int tmp = index;
			while (tmp < actSize) {
				myStore[tmp] = myStore[tmp + 1];
				myStore[tmp + 1] = null;
				tmp++;
			}
			actSize--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}

	}

	public int size() {
		return actSize;
	}

	private void increaseListSize() {
		myStore = Arrays.copyOf(myStore, myStore.length * 2);
		
			}

}