package com.example.course.registration.system.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.course.registration.system.entity.CourseRegistry;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry, Integer>{

}
