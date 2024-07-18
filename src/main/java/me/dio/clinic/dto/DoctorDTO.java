package me.dio.clinic.dto;

import me.dio.clinic.domain.model.Doctor;

import java.util.List;
import java.util.stream.Collectors;

public class DoctorDTO {
    private Long id;
    private String name;
    private String specialty;
    private ContactDTO contact;
    private List<AvailabilityDTO> availability;

    public DoctorDTO(Doctor doctor) {
        this.id = doctor.getId();
        this.name = doctor.getName();
        this.specialty = doctor.getSpecialty();
        this.contact = new ContactDTO(doctor.getContact());

        if (doctor.getAvailability() != null && !doctor.getAvailability().isEmpty()) {
            this.availability = doctor.getAvailability().stream()
                    .map(AvailabilityDTO::new)
                    .collect(Collectors.toList());
        } else {
            this.availability = null; // ou Collections.emptyList() conforme sua preferência
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public ContactDTO getContact() {
        return contact;
    }

    public void setContact(ContactDTO contact) {
        this.contact = contact;
    }

    public List<AvailabilityDTO> getAvailability() {
        return availability;
    }

    public void setAvailability(List<AvailabilityDTO> availability) {
        this.availability = availability;
    }

    // getters e setters
    // ...
}
