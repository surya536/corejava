package com.svkp;
class A
{
	void display()
	{
		System.out.println("Welcome to inheritance");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("this is call B");
	}
}
class C extends B
{
	void print()
	{
		System.out.println("this is call C");
	}
}

public class Multylevelinharitence {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new  C ();
		obj.display();
		obj.show();
		obj.print();
		
	}

}
