package com.example.course.registration.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.registration.system.entity.Course;
import com.example.course.registration.system.entity.CourseRegistry;
import com.example.course.registration.system.repo.CourseRegistryRepo;
import com.example.course.registration.system.repo.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	CourseRepo courseRepo;
	
	@Autowired
	CourseRegistryRepo courseRegistryRepo;
	
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

	public List<CourseRegistry> getRegisteredCourses() {
		return courseRegistryRepo.findAll();
	}

	public void registerStudent(String name,String emailId,String courseName) {
		CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
		courseRegistryRepo.save(courseRegistry);
	}
}
