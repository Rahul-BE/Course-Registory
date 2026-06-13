package com.example.course.registration.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.registration.system.entity.Course;
import com.example.course.registration.system.entity.CourseRegistry;
import com.example.course.registration.system.service.CourseService;

@RestController
@CrossOrigin(origins = "https://course-registory.vercel.app")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return courseService.getAllCourses();
	}

	@GetMapping("courses/registered")
	public List<CourseRegistry> getRegisteredCourses(){
		return courseService.getRegisteredCourses();
	}
	
	@PostMapping("/course/register")
	public String registerStudent(@RequestParam("name") String name,
									@RequestParam("emailId") String emailId,
									@RequestParam("courseName") String courseName)
	{
		courseService.registerStudent(name,emailId,courseName);
		return "Congratulations ! "+name+" Successfully Enrolled for "+courseName;
	}
}
