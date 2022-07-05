package com.svkp.demo;

public class Demothrow{
	{
		int age = 0;
		if (age < 18)
		   {
			   throw new ArithmeticException("not elegible for voting");
		   }
	     else
			   System.out.println("Elegble for voting");
	}
   
	public static void main(String[] args) {
		Demothrow obj = new Demothrow();
		obj. check age(18);
	}

}
