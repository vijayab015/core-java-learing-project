package Inter;

import java.io.*;    
import java.net.*;    
public class Sort{    
public static void main(String[] args){   
	
	int a[]= {10,2,46,8,9,20,3,1};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int tem=a[i];
				a[i]=a[j];
				a[j]=tem;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print( a[i] +",");
	}
	
}  
}    