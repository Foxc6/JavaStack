package com.example.assignment3.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.assignment3.models.Course;
import com.example.assignment3.models.User;
import com.example.assignment3.repositories.CourseRepository;
import com.example.assignment3.repositories.UserRepository;

@Service
public class CourseService {

	private final UserRepository userRepository;
	private final CourseRepository courseRepository;

	public CourseService(UserRepository userRepository, CourseRepository courseRepository) {
		super();
		this.userRepository = userRepository;
		this.courseRepository = courseRepository;
	}

	public User findUserById(Long id) {
		return userRepository.findOne(id);
	}
	
	public List<Course> getAll() {
		return courseRepository.findAll();
	}

}
