package com.java8;

public class LamdaTest {

	   final static String salutation = "Hello! ";
	   
	   public static void main(String args[]) {
	      GreetingService greetService1 = test1 -> 
	      System.out.println("hhh");
	      greetService1.sayMessage("Mahesh");
	   }
		
	   
	   interface GreetingService 
	   {
	      void sayMessage(String message);
	   }
	}
class  Greeting implements LamdaTest.GreetingService
{

	@Override
	public void sayMessage(String message) {
		// TODO Auto-generated method stub
		
	}
	
}