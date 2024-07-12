package me.dio.clinic.domain.repository;

import me.dio.clinic.domain.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDoctor extends JpaRepository<Doctor, Long> {

}
