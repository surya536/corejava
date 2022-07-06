package com.svkp.exceptions;
import java.util.*;
public class Demoexception {
   
	public static void main(String[] args)throws Exception
	{
		String s = "surya";
		Scanner scanner = new Scanner(s);
		System.out.println("" + scanner.nextLine());
		System.out.println("" + scanner.ioException());
		scanner.close();
		
	}

}
