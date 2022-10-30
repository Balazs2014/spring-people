package com.example.people.service;

import com.example.people.model.Contact;
import com.example.people.model.People;
import com.example.people.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact postContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }

    @Transactional
    public Contact putContact(Long id, Contact updateContact) {
        Contact contact = contactRepository.findById(id).orElseThrow(() -> new IllegalStateException("Az adott azonosítóval nem található kapcsolat"));
        if (!Objects.equals(contact.getEmail(), updateContact.getEmail()) && updateContact.getEmail() != null) {
            contact.setEmail(updateContact.getEmail());
        }
        if (!Objects.equals(contact.getPhone(), updateContact.getPhone()) && updateContact.getPhone() != null) {
            contact.setPhone(updateContact.getPhone());
        }
        return contactRepository.save(contact);
    }
}
