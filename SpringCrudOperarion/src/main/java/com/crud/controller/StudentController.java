package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.module.Student;
import com.crud.service.StudentServiceImpl;

@RestController
@RequestMapping(name ="/studentdata")
public class StudentController {
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@GetMapping("{id}")
	public Student getStudent(@PathVariable("id") int id) {
	Student stud =	studentServiceImpl.getStudent(id);
		
		return stud;}
	@GetMapping("/getAllStudent")
	public List <Student> getAllStudent(){
		
		List<Student>allStudent=studentServiceImpl.getAllStudent();
		
		return allStudent;
	}
	@PostMapping("/saveStudent")
	public Student saveStudent(@ RequestBody Student student){
		
		Student stu =studentServiceImpl.saveStudent(student);
		
		return stu;
	}
	@DeleteMapping("/{id}")
	public void deletStudent(@PathVariable("id") int id){
		System.out.println("data is deleted");
	}
	@PostMapping("/updateStudent")
	public void updateStudent(@RequestBody Student student){
	studentServiceImpl.saveStudent(student);
	System.out.println("information is updated");
	}
}
