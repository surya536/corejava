package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entiy.Student;
import com.example.demo.service.StudentService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class StudentControler {
	@Autowired
	private StudentService service;
	@PostMapping("/addstudent/")
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	public List<Student> saveStudents(@RequestBody List<Student> student){
	     return service.saveStudents(student);
	}
	@GetMapping("Studentbyid/{id}")
	public List<Student> findStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	@DeleteMapping("/deletestudents")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
	
}
	
