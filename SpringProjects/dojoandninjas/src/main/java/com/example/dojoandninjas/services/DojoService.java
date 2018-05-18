package com.example.dojoandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dojoandninjas.models.Dojo;
import com.example.dojoandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public List<Dojo> getAll() {
		return dojoRepository.findAll();
	}
	
	public void createDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	
	public Dojo getDojo(Long id) {
		return dojoRepository.findOne(id);
	}
}
