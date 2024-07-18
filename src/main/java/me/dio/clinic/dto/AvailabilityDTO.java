package me.dio.clinic.dto;

import me.dio.clinic.domain.model.Availability;

public class AvailabilityDTO {
    private Long id;
    private String date;
    private String time;

    public AvailabilityDTO(Availability availability) {
        this.id = availability.getId();
        this.date = availability.getDate().toString();
        this.time = availability.getTime().toString();
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
