package com.th;

public class ThreadByRunnable implements Runnable {
	public void run()
	{
		System.out.println("Running Thread");
	}
	public static void main(String[] args) {
		
		ThreadByRunnable tr=new ThreadByRunnable();
		Thread th=new Thread(tr);
		th.start();
		
		
	}
	

}
