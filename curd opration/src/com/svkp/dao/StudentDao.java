package com.svkp.dao;

import com.svkp.entity.Student;

public interface StudentDao {
    public abstract Student getStudentById(int sid);
    public abstract void addStudent(Student student);
    public abstract void updateStudent(Student student);
    public abstract void removeStudent(Student student);
    
    
    public abstract void begainTransaction();
    public abstract void commitTransaction();
    
}
