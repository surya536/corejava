package com.svkp;
class Parent
{
	final int a = 10;
	final void display()
	{
		System.out.println(" this is parent class");
	}
}
public class Svkpp extends Parent{
	void display1()
	{
		System.out.println("surya");
	}

	public static void main(String[] args) {
		Svkpp obj = new Svkpp();
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
