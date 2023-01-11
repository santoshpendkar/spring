package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.module.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
