package com.example.course.registration.system.dao;

import java.util.List;
import java.util.Optional;

import com.example.course.registration.system.entity.Student;

public interface StudentDAO {
	Student save(Student student);
	Optional<Student> findByEmail(String email);
	List<Student> findAll();
}
