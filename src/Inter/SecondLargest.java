package Inter;

import java.util.Scanner;

public class SecondLargest {
	
	public static void main(String[] args) {
		/*
		 * Scanner scn=new Scanner(System.in);
		 * 
		 * int len=scn.nextInt(); int a[]=new int[len]; for(int i=0;i<len;i++) {
		 * a[i]=scn.nextInt(); } int temp;
		 */
		int a[]= {7,8,9,2,4,6,7,2};
		int len=a.length;
		int temp;
		for(int j=0;j<len;j++)
		{
			for(int k=j+1;k<len;k++)
			{
				if(a[j]>a[k])
				{
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		for(int i=0;i<len;i++)
		{
		System.out.print(a[i] +" ");
		}
		
		 
		 
	}

}
