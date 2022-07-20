package com.svkp.thread;
import java.util.ArrayList;
import java.util.Collections;
public class Studentmain {
	
		int[] intArr= {104,102,101,103,105};
	    Arrays.sort(intArr);
		
		
		public static void main(String[] args) {

	    ArrayList<Student> al=new ArrayList<Student>();
	    al.add(new Student(104,"lavanya"));
	    al.add(new Student(102,"damini"));
	    al.add(new Student(101,"tim"));
	    al.add(new Student(103,"sabiha"));
	    al.add(new Student(105,"chris"));
	    
	 Collections.sort((al);
	     System.out.println("sorted");		
			
	}

}
