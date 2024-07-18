package me.dio.clinic.dto;

import me.dio.clinic.domain.model.Address;

public class AddressDTO {
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public AddressDTO(Address address) {
        this.street = address.getStreet();
        this.city = address.getCity();
        this.state = address.getState();
        this.zipcode = address.getZipcode();
    }

    // getters and setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
