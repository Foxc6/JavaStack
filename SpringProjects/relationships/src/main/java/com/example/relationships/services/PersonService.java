package com.example.relationships.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relationships.models.Person;
import com.example.relationships.repositories.PersonRepository;

@Service
public class PersonService {
    private PersonRepository personRepository;
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> allPersons(){
        return personRepository.findAll();
    }

    
    public Person findPersonById(Long id) {
        return personRepository.findOne(id);
    }
    
    public void addPerson(Person person){
        personRepository.save(person);
    }
}
