package com.example.assignment3.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.assignment3.models.Semester;
import com.example.assignment3.repositories.SemesterRepository;

@Service
public class SemesterService {

	private final SemesterRepository semesterRepository;

	public SemesterService(SemesterRepository semesterRepository) {
		super();
		this.semesterRepository = semesterRepository;
	}

	public Semester findSemesterById(Long id) {
		return semesterRepository.findOne(id);
	}
	
	public List<Semester> getAll() {
		return semesterRepository.findAll();
	}

}
