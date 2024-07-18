package me.dio.clinic.service;

import me.dio.clinic.domain.model.Availability;
import me.dio.clinic.domain.model.Doctor;
import me.dio.clinic.domain.repository.AvailabilityRepository;
import me.dio.clinic.domain.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AvailabilityRepository availabilityRepository;

    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Doctor addAvailabilities(Long doctorId, List<Availability> availabilityDTOS) {
        Doctor doctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        List<Availability> availabilities = availabilityDTOS.stream().map(request -> {
            Availability availability = new Availability();
            availability.setDate(request.getDate());
            availability.setTime(request.getTime());
            availability.setDoctor(doctor);
            return availability;
        }).collect(Collectors.toList());

        availabilityRepository.saveAll(availabilities);

        return doctorRepository.findById(doctorId)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
