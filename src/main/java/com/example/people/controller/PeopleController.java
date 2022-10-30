package com.example.people.controller;

import com.example.people.model.People;
import com.example.people.service.PeopleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {
    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("/get")
    public List<People> getPeople() {
        List<People> peopleList = peopleService.getPeople();
        return peopleList;
    }

    @PostMapping("/post")
    public ResponseEntity<String> postPeople(@RequestBody List<People> people) {
        peopleService.postPeople(people);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePeople(@PathVariable("id") Long id) {
        peopleService.deletePeople(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
