package me.dio.clinic.domain.model;

import jakarta.persistence.*;

@Embeddable
public class Contact {

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String phoneNumber;

    @Embedded
    private Address address;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
