package com.svkp.thread;

public class Swapnumbers {

	public static void main(String[] args) {
            float a=1.02f,b=3.45f;
            System.out.println("-----Before swaping-----");
            System.out.println("first number "+a);
            System.out.println("second numbe "+b);
            float temp = a;
            a=b;
            b=temp;
            System.out.println("-----After swaping-----");
            System.out.println("first number "+a);
            System.out.println("second numbe "+b);

	}

}
