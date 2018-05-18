package com.example.relationships.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relationships.models.License;
import com.example.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
    private LicenseRepository licenseRepository;
    public LicenseService(LicenseRepository lRepository){
        this.licenseRepository = licenseRepository;
    }
    
    public License addLicense(License license){
        licenseRepository.save(license);
        return license;
    }
}
