package com.crud.service;

import java.util.List;

import com.crud.module.Student;

public interface StudentService {
	
	// getting student on the basis of id
	public Student getStudent(int id) ;
	
	// getting all student list
	public List<Student> getAllStudent();
	
	// save the Student
	public Student saveStudent(Student student);
	
	// delete the Student on the basic of id
	public void deletStudent(int id);
	
	// update Student
	public void updateStudent(Student student);
		
	
	
	
	
	
}
