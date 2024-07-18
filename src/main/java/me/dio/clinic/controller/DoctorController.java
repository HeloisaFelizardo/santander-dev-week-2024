package me.dio.clinic.controller;

import me.dio.clinic.domain.model.Availability;
import me.dio.clinic.dto.DoctorDTO;
import me.dio.clinic.domain.model.Doctor;
import me.dio.clinic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    public DoctorService doctorService;

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorService.saveDoctor(doctor);
    }

    @PostMapping("/{id}/availability")
    public Doctor addAvailabilities(@PathVariable Long id, @RequestBody List<Availability> availability) {
        return doctorService.addAvailabilities(id, availability);
    }

    @GetMapping
    public List<DoctorDTO> getAllDoctors() {
        List<Doctor> doctors = doctorService.getAllDoctors();
        return doctors.stream().map(DoctorDTO::new).collect(Collectors.toList());
    }
}
