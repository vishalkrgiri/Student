package com.cg.iter.service;

import com.cg.iter.bean.Student;

public interface StudentService {

	boolean create(Student stud);

	Student findStudentById(int nextInt);

	boolean updateStudent(Student upStudent);

	boolean deleteStudent(int nextInt);

	Student findStudentByName(String next);

}
