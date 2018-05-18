package com.example.assignment3.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment3.models.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long>{
	Course findCourseById(Long id);
	List<Course> findAll();

}
