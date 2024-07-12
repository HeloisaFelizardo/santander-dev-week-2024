package me.dio.clinic.service;

import me.dio.clinic.domain.model.Doctor;

public interface DoctorService {
    Doctor getDoctorById(Long id);

    Doctor createDoctor(Doctor doctorToCreate);
}
