package com.svkp.dao;

import javax.persistence.EntityManager;

import com.svkp.entity.Student;

public class StudentDaoImp1 implements StudentDao {
	private EntityManager entityManager;
	public StudentDaoImp1(EntityManager entityManager) {
		super();
		this.entityManager = JPAUtil.getEntityManager();
		
	}

	@Override
	public Student getStudentById(int sid) {
	  Student student=entityManager.find(Student.class,sid);
		return student;
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.merge(student);
	}

	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.remove(student);
	}

	@Override
	public void begainTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
