package com.svkp.demo;

public interface showble {
    public interface printable {

	}
	public void show();
    public final int x=10;
    
}
interface printable{
	void print();
	
}
class Interfacedemo implements showble.printable{
	public void show()
	{
		System.out.println("hello");
	}
	public void print()
	{
		System.out.println("world");
	}
	public static void main(String[] args)
	{
		Interfacedemo obj= new Interfacedemo();
		obj.show();
		obj.print();
		
		
	}
}
