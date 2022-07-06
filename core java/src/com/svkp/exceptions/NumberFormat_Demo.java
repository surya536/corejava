package com.svkp.exceptions;

public class NumberFormat_Demo {

	public static void main(String[] args) {
		try
		{
			int num = Integer.parseInt("akki");
			System.out.println("num");
		}
		catch(NumberFormatException ex)
		{
			System.out.println("number formate exception");
		}
	}

}
