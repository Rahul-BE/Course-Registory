package com.example.course.registration.system.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.course.registration.system.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
	Optional<Course> findByCourseName(String courseName);
}
