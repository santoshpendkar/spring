package com.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.StudentRepo;
import com.crud.module.Student;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student getStudent(int id) {
		 Student student=studentRepo.findById(id).get();
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student>student = new ArrayList<Student>();
				studentRepo.findAll().forEach(stud -> student.add(stud));
		
		return student;
	}

	@Override
	public Student saveStudent(Student student) {
		Student stud = studentRepo.save(student);
		
		return stud;
	}

	@Override
	public void deletStudent(int id) {
		studentRepo.deleteById(id);
		
	}

	@Override
	public void updateStudent(Student student) {
		Student stud =studentRepo.save(student);
	}
	
	
	
}
