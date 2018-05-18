package com.example.dojoandninjas.services;

import org.springframework.stereotype.Service;

import  com.example.dojoandninjas.models.Ninja;
import  com.example.dojoandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
}
