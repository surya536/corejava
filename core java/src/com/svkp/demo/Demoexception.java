package com.svkp.demo;

public class Demoexception {
	
  
	public static void main(String[] args) {
		int n1,n2;
		try {
			n1=0;
			n2=6;
			int result= n2/n1;
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			System.out.println("divide by zero is not all");
			
		}
		catch(Exception e) {
			System.out.println("what is the best");
			
		}
	}

}
