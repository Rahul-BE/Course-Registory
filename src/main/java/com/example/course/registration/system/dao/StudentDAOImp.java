package com.example.course.registration.system.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.course.registration.system.entity.Student;
import com.example.course.registration.system.repo.StudentRepo;

@Repository
public class StudentDAOImp implements StudentDAO{

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Optional<Student> findByEmail(String email) {
		// TODO Auto-generated method stub
		return studentRepo.findByEmail(email);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}
	
	
}
