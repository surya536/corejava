package com.svkp.thread;
import java.util.Scanner;
public class SmallestNubers {
	 public static void main(String[] args) {
	    	
		Scanner in = new Scanner(System.in);
		System.out.print("A:-");
		Double x = in.nextDouble();
		System.out.print("B:-");
		Double y = in.nextDouble();
		System.out.print("c:-");
		Double z = in.nextDouble();
		System.out.print("The smallest value is " + smallest(x, y, z) + "\n");
	}
	 public static double smallest(double x, double y, double z)
	    {
	        return Math.min(Math.min(x, y), z);
	    }
}
