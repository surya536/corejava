package com.svkp.demo;

import java.rmi.server.ObjID;

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
		int age=(18);
	}

}
