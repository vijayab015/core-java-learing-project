package com.test;

public class ArraySearch {
	public static void main(String[] args) {

		int arr[] = { 10, 20, 45, 56, 65, 76, 78,10 };
		int postion;
		
	  postion=findElement(arr,arr.length,78);
	  if(postion == -1)
	  System.out.println("Not found");
	  else
		  System.out.println("Found at "+postion);
	

	}

static int findElement(int arr[], int n, int key)
	{
		for (int i = 0; i < n; i++)
			if (arr[i] == key)
				return i;
		return -1;

	}
}