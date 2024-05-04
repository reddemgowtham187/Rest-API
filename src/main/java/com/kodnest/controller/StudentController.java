package com.kodnest.controller;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.entity.Student;
import com.kodnest.service.StudentService;
@RestController
public class StudentController {

	StudentService studentService;
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping(value="/students")
	public List<Student> getStudent() {
		return studentService.getStudent();
	}
	
	@GetMapping(value="/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studentService.getStudent(id);

	}
	
	@PostMapping(value="/students/post")
	public void postStudent(@RequestBody Student student) {
		System.out.println(student);
		 studentService.postStudent(student);

	}
	
	@DeleteMapping(value="/students/delete/{id}")
	public void deleteSudent(@PathVariable int id) {
		System.out.println(id);
		studentService.deleteSudent(id);
	}
	
	@PutMapping(value="/students/update/{id}")
	public void updateStudent(@PathVariable int id,
			@RequestBody Student student) {
		System.out.println(id);
		System.out.println(student);
		studentService.updateStudent(id,student);
	}

	
	
}
