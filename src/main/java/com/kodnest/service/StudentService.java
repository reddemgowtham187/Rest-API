package com.kodnest.service;

import java.util.List;

import com.kodnest.entity.Student;

public interface StudentService {

	List<Student>getStudent();

	Student getStudent(int id);

	void postStudent(Student student);

	void deleteSudent(int id);

	void updateStudent(int id,Student student);
	
	
}
