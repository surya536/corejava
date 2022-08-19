package com.svkp.sevice;

import com.svkp.dao.StudentDao;
import com.svkp.dao.StudentDaoImp1;
import com.svkp.entity.Student;

public class StudentServiceImp1 implements studentservice {
	
	private StudentDao dao;

	public StudentServiceImp1() {
		dao=new StudentDaoImp1(null);
	}
	@Override
	public Student getStudentById(int sid) {
		Student student=dao.getStudentById(sid);
		return null;
	}

	@Override
	public void addStudent(Student student) {
		dao.begainTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void updateStudent(Student student) {
		dao.begainTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) {
		dao.begainTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}
	public StudentDao getDao() {
		return dao;
	}
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

}
