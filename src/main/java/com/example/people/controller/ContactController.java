package com.example.people.controller;

import com.example.people.model.Address;
import com.example.people.model.Contact;
import com.example.people.service.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


    @PostMapping("/post")
    public ResponseEntity<String> postContact(@RequestBody Contact contact) {
        contactService.postContact(contact);
        return new ResponseEntity<>("Sikeres hozzáadás", HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteContact(@PathVariable("id") Long id) {
        contactService.deleteContact(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
