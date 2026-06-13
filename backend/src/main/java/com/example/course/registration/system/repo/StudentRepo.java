package com.example.course.registration.system.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.course.registration.system.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{
	Optional<Student> findByEmail(String email);
}
