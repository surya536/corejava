package com.svkp.exceptions;

import java.awt.AWTException;

public class Demothrows {
	int division(int a,int b) throws ArithmeticException,AWTException{
		int result=a/b;
		return result;
		
	}

	public static void main(String[] args, Throwable e) {
		Demothrows obj = new Demothrows();
		try
		{
			System.out.println(obj.division(22, 0));
		}
		catch(ArithmeticException | AWTException)
		{
			
			e.printStackTrace();
		}
	}

}
