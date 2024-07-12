package me.dio.clinic.service.impl;

import me.dio.clinic.domain.model.Doctor;
import me.dio.clinic.domain.repository.DoctorRepository;
import me.dio.clinic.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Doctor createDoctor(Doctor doctorToCreate) {
        if(doctorRepository.existsByEmail(doctorToCreate.getContact().getEmail())){
            throw new IllegalArgumentException("This email already exists.");
        }
        return doctorRepository.save(doctorToCreate);
    }
}
