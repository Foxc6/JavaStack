package com.example.assignment3.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment3.models.Semester;

@Repository
public interface SemesterRepository extends CrudRepository<Semester, Long>{
	Semester findSemesterById(Long id);
	List<Semester> findAll();

}