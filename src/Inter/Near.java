package Inter;

import java.util.Scanner;

public class Near {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scn =new Scanner(System.in);
		int a=scn.nextInt();
		int rem=a%10;
		if(rem<5)
		{
			a=a-rem;
			System.out.println("Nearest divisable by 10 is "+a);
			
		}
		
		else {
			rem=rem-10;
		    a=a-rem;
		System.out.println("Nearest divisable by 10 is "+a);
		}
		
		
	}

}
