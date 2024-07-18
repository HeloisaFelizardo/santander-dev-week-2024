package me.dio.clinic.domain.repository;

import me.dio.clinic.domain.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    @Query("SELECT CASE WHEN COUNT(d) > 0 THEN TRUE ELSE FALSE END FROM tb_doctor d WHERE d.contact.email = :email")
    boolean existsByEmail(@Param("email") String email);
}
