package com.cg.iter.dao;

import com.cg.iter.bean.Student;

public interface StudentDao {

	boolean create(Student stud);

	Student findStudentById(int id);

	boolean updateStudent(Student stud);

	boolean deleteStudent(int id);

	Student findStudentByName(String next);

}
