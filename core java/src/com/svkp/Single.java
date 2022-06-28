package com.svkp;
abstract class Aptraffic_rules
{
	abstract void speedlimit();
	abstract void rashdriving();
}
class A 
{
	void display()
	{
		
		System.out.println("displayy");
	}
	
}
public class Single extends Aptraffic_rules {
	
    void speedlimit()
    {
    	System.out.println("the speed limit is 80KMPH");
    }
    void rashdriving()
    {
    	System.out.println("allort voice message");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A obj = new A();
        
	}

}
