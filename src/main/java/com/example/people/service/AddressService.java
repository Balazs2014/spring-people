package com.example.people.service;

import com.example.people.model.Address;
import com.example.people.model.Contact;
import com.example.people.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address postAddress(Address address) {
        return addressRepository.save(address);
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }

    @Transactional
    public Address putAddress(Long id, Address updateAddress) {
        Address address = addressRepository.findById(id).orElseThrow(() -> new IllegalStateException("Az adott azonosítóval nem található lakcím"));
        if (!Objects.equals(address.getCity(), updateAddress.getCity()) && updateAddress.getCity() != null) {
            address.setCity(updateAddress.getCity());
        }
        if (!Objects.equals(address.getStreetHouseNumber(), updateAddress.getStreetHouseNumber()) && updateAddress.getStreetHouseNumber() != null) {
            address.setStreetHouseNumber(updateAddress.getStreetHouseNumber());
        }
        if (!Objects.equals(address.getType(), updateAddress.getType()) && updateAddress.getType() != null) {
            address.setType(updateAddress.getType());
        }
        return addressRepository.save(address);
    }
}
