package com.example.languages.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.languages.models.Language;
import com.example.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
    private LanguageRepository languageRepository;
    public LanguageService(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }

    public List<Language> allLanguages(){
        return languageRepository.findAll();
    }

    
    public Language findLanguageById(Long id) {
        return languageRepository.findOne(id);
    }
    
    public void addLanguage(Language language){
        languageRepository.save(language);
    }
    
    public void updateLanguage(Language language) {
    		languageRepository.save(language);
    }
    
    public void destroyLanguage(Long id) {
        languageRepository.delete(id);
    }
}
