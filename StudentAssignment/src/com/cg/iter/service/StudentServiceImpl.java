package com.cg.iter.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.iter.bean.Student;
import com.cg.iter.dao.StudentDao;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studDao;
	public StudentServiceImpl() {
		System.out.println("stud service contr");

	}
	@Override
	public boolean create(Student stud) {
		return studDao.create(stud);
	}
	@Override
	public Student findStudentById(int id) {
		return studDao.findStudentById(id);
	}
	@Override
	public boolean updateStudent(Student stud) {
		// TODO Auto-generated method stub
		return studDao.updateStudent(stud);
	}
	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return studDao.deleteStudent(id);
	}
	@Override
	public Student findStudentByName(String next) {
		// TODO Auto-generated method stub
		return studDao.findStudentByName(next);
	}

	
}
