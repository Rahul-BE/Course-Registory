package com.example.course.registration.system.entity;

import java.util.HashSet;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "students", uniqueConstraints = 
							{@UniqueConstraint(columnNames = "email")})
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	@Column(nullable = false)
	private String email;
	
	@ManyToMany
	@JoinTable(name = "student_id",
							joinColumns = @JoinColumn(name = " student_id"),
							inverseJoinColumns = @JoinColumn(name = "course_id"))
	private HashSet<Course> courses = new HashSet<>();

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public HashSet<Course> getCourses() {
		return courses;
	}

	public void setCourses(HashSet<Course> courses) {
		this.courses = courses;
	}
	
	

}
