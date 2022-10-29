package com.example.people.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String streetHouseNumber;
    private String type;

    public Address() {
    }

    public Address(Long id, String city, String streetHouseNumber, String type) {
        this.id = id;
        this.city = city;
        this.streetHouseNumber = streetHouseNumber;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetHouseNumber() {
        return streetHouseNumber;
    }

    public void setStreetHouseNumber(String streetHouseNumber) {
        this.streetHouseNumber = streetHouseNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
