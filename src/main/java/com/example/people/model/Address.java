package com.example.people.model;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Város megadása kötelező")
    private String city;
    @NotBlank(message = "Utca, házszám megadása kötelező")
    private String streetHouseNumber;
    @NotBlank(message = "Típus megadása kötelező")
    private String type;

    @OneToMany(targetEntity = Contact.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private List<Contact> contacts;

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
