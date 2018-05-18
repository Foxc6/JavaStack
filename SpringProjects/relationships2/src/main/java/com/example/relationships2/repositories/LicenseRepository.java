package com.example.relationships2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.relationships2.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {
	
}
