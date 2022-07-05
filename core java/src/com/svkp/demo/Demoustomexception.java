package com.svkp.demo;
class Product extends Exception
{
	public void Product(String s)
	{
		Product(s);
	}
	
}
public class Demoustomexception {
	void Productcheck(int weight)throws Product
	{
		if(weight < 100)
		{
			throws new Exception("Product invalid");
		}
	}

	public static void main(String[] args) {
		Demoustomexception obj = new Demoustomexception();
		try
		{
			System.out.println("laught the excption weight is should be");
		}
		catch 
		{
			System.out.println(ex.get mesage());
		}
	}

}
