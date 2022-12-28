package com.tnsif.repository;

import org.springframework.data.repository.CrudRepository;

import com.tnsif.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
