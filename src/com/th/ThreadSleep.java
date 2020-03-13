package com.th;

public class ThreadSleep extends Thread{
	
	public static void main(String[] args) {
		ThreadSleep th =new ThreadSleep();
		ThreadSleep th1 =new ThreadSleep();
		ThreadSleep th2 =new ThreadSleep();
		ThreadSleep th3 =new ThreadSleep();
		System.out.println("hello");
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		th2.start();
		th3.start();
		
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try {
			Thread.sleep(1500);
			}
			catch(Exception e)
			{
				
			}
			
		System.out.print(i +"-");
		}
	}

}
