package com.example.demo.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class Student {
   	 private Integer id;
	 private String name;
	 private long rollno;
	 private String qualification;
	 private String Course;
	 private int year;
	 private long halTickatno;
	 public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		this.Course = course;
	}
	 public Student() {
		 
	 }
	 public Student(Integer id,String name,String Course,long rollno,int year,long halTickatno, String qualification) {
		 this.id=id;
		 this.name=name;
         this.Course=Course;	
		 this.rollno=rollno;
		 this.year= year;
		 this.qualification=qualification;
		 this.halTickatno=halTickatno;
		 
	 }
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public long getHalTickatno() {
		return halTickatno;
	}
	public void setHalTickatno(long halTickatno) {
		this.halTickatno = halTickatno;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", qualification=" + qualification
				+ ", Course=" + Course + ", year=" + year + ", halTickatno=" + halTickatno + "]";
	}
	
}

