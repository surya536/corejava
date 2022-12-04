package com.svkp.client;
import java.util.Scanner;

import com.svkp.entity.Student;
import com.svkp.sevice.StudentServiceImp1;
import com.svkp.sevice.studentservice;

public class Client {

	public static void main(String[] args) {
	   studentservice service =new StudentServiceImp1();
	   Student student = new Student ();
	   try {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter student data");
		   System.out.print("enter sid:  ");
		   student.setSid(sc.nextInt());
		   System.out.print("enter Sname:  ");
		   student.setSname(sc.next());
		   System.out.print("enter Sbranch:  ");
		   student.setSbranch(sc.next());
		   service.addStudent(student);
		   
	   }
	   catch(Exception ex){
		   System.out.println("the emetered input is not according to the type defiend");
		   
	   }
	   System.out.println("added student data");
	   

	}

}
