package com.svkp.thread;
import java.util.Scanner;
public class Pointer {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         
	    
	         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");54
	         
	        for (int i = 1; i <= rows; i++) 
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(i+" ");
	            }
	             
	            System.out.println();
	        }
         
        sc.close();
	
	}

}
