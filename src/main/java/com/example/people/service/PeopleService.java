package com.example.people.service;

import com.example.people.model.People;
import com.example.people.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

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

    @Transactional
    public People putPeople(Long id, String name) {
        People people = peopleRepository.findById(id).orElseThrow(() -> new IllegalStateException("Az adott azonosítóval nem található személy"));
        if (!Objects.equals(people.getName(), name) && name != null) {
            people.setName(name);
        }
        return peopleRepository.save(people);
    }

}
