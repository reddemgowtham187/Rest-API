package com.kodnest.serviceimpl;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kodnest.entity.Student;
import com.kodnest.repository.StudentRepository;
import com.kodnest.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	StudentRepository studentRepository;
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	@Override
	public List<Student> getStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudent(int id) {
		Optional<Student> student=studentRepository.findById(id);
		return student.orElse(null);
	}
	@Override
	public void postStudent(Student student) {
		studentRepository.save(student);
	}
	@Override
	public void deleteSudent(int id) {
		studentRepository.deleteById(id);		
	}
	@Override
	public void updateStudent(int id,Student upstd) {
		Optional<Student> exisstd = studentRepository.findById(id);

		if(exisstd.isPresent()) {
			//Updating logic
			Student student = exisstd.get();

			String newname=upstd.getName();
			student.setName(newname);

			studentRepository.save(student);
			System.out.println("Update Success!!");
		}
		else {
			System.out.println("Record is not found!!");
		}
	}


}
