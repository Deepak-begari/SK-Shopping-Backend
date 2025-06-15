// src/main/java/org/example/repository/AddressRepository.java
package org.example.repository;

import org.example.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByUserId(Long userId);

    boolean existsByUserId(Long userId);

    @Transactional
    void deleteByUserId(Long userId);
}