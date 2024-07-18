package me.dio.clinic.domain.repository;

import me.dio.clinic.domain.model.Availability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvailabilityRepository extends JpaRepository<Availability, Long> {
}
