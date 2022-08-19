package com.svkp.sevice;

import com.svkp.entity.Student;

public interface studentservice {
	public abstract Student getStudentById(int sid);
    public abstract void addStudent(Student student);
    public abstract void updateStudent(Student student);
    public abstract void removeStudent(Student student);
}
