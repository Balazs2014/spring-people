package com.example.people.service;

import com.example.people.model.People;
import com.example.people.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<People> getPeople() {
        return peopleRepository.findAll();
    }

    public List<People> postPeople(List<People> people) {
        return peopleRepository.saveAll(people);
    }

    public void deletePeople(Long id) {
        peopleRepository.deleteById(id);
    }

}
