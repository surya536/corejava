package com.svkp.exceptions;

public class DemException {
      
	public static void main(String[] args)
	{
	  try {
		int a =10;
		int b = 0;
		int c = a/b;
		System.out.println("result = "+c);
	   }
	   catch (ArithmeticException e) {
		   System.out.println("0 is cannot divisible ");
	   }
	}

}
