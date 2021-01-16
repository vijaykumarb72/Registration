package com.springboot.repository;

import com.springboot.model.Student;

public interface StudentRepository {

	public Student save(Student student);

	Student find(Long id);
}