package com.example.people.controller;

import com.example.people.model.Address;
import com.example.people.model.Contact;
import com.example.people.model.People;
import com.example.people.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/post")
    public ResponseEntity<String> postAddress(@RequestBody Address address) {
        addressService.postAddress(address);
        return new ResponseEntity<>("Sikeres Hozzáadás", HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAddress(@PathVariable("id") Long id) {
        addressService.deleteAddress(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<String> putAddress(@PathVariable("id") Long id, @RequestBody Address address) {
        addressService.putAddress(id, address);
        return new ResponseEntity<>("Sikeres módosítás", HttpStatus.OK);
    }
}
