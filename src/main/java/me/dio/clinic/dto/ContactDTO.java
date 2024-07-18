package me.dio.clinic.dto;

import me.dio.clinic.domain.model.Contact;

public class ContactDTO {
    private String email;
    private String phoneNumber;
    private AddressDTO address;

    public ContactDTO(Contact contact) {
        this.email = contact.getEmail();
        this.phoneNumber = contact.getPhoneNumber();
        this.address = new AddressDTO(contact.getAddress());
    }

    // getters and setters
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

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }
}
