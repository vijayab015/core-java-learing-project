package com.test;

public class Array2D {

	public static void main(String[] args) {

		int [][] a2= {{1,2,7,8},{5,6,9,9},{5,6,9,9}};
		System.out.println(a2[0].length);
		for(int i=0;i<a2.length;i++)
			for(int j=0;j<a2[i].length;j++)
		{
			System.out.print(a2[i][j]);
			
		}

	}

}
