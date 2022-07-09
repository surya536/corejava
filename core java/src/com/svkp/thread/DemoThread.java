package com.svkp.thread;

public class DemoThread extends Exception{
	public void run() throws InterruptedException {
		for(int i=0;i<5;i++)
		{
			System.out.println("i");
			Thread.sleep(2000);
		}
	}
}
