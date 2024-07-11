package me.dio.clinic.domain.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "tb_availability")
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    @ElementCollection
    private List<String> timeSlots;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<String> getTimeSlots() {
        return timeSlots;
    }

    public void setTimeSlots(List<String> timeSlots) {
        this.timeSlots = timeSlots;
    }
}

