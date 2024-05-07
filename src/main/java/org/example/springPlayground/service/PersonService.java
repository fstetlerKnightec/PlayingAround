package org.example.springPlayground.service;

import org.example.springPlayground.model.Person;
import org.example.springPlayground.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepo personRepo;

    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public List<Person> getPersons() {
        return personRepo.findAll();
    }

    public Person addPerson(Person person) {
        return personRepo.save(person);
    }




}
