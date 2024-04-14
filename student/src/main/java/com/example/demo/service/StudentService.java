package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entiy.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
@Autowired
private StudentRepository repository;

//save a Student
public Student saveStudent (Student student) {
	return repository.save(student);
	
}

//save all students
public List<Student> saveStudents(List<Student> students){
	return repository.saveAll(students);
}
 
//get all students
public List<Student> getStudentById(int id) {
	return repository.findAll();
}
	
//get student by id
public Student getStudentById1(int id) {
	return repository.findById(id).orElse(null);
}

//update
public Student updateStudent(Student student) {
	Student existingstudent=repository.findById(student.getId()).orElse(null);
	existingstudent.setName(student.getName());
	existingstudent.setRollno(student.getRollno());
	existingstudent.setYear(student.getYear());
	existingstudent.setCourse(student.getCourse());
	existingstudent.setQualification(student.getQualification());
	existingstudent.setHalTickatno(student.getHalTickatno());
	return existingstudent;
}
//delete
public String deleteStudent (int id) {
	repository.deleteById(id);
	return "Student deleted";
}
	
}

