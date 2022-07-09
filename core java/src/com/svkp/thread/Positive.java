package com.svkp.thread;
import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number:-  ");
		 i = sc.nextInt();
		 if(i>0)
		 {
			 System.out.println("positive number");
		 }
		 else if(i<0)
		 {
			 System.out.println("negitive number");
		 }
		 else
		 {
			 System.out.println("zero");
		 }
		

	}

}
