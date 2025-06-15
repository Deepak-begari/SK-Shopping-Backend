package org.example.repository;

import org.example.RegistrationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationDetailsRepository extends JpaRepository<RegistrationDetails, Long> {
}