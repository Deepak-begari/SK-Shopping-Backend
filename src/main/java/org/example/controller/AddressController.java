package org.example.controller;

import org.example.model.Address;
import org.example.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
@CrossOrigin
public class AddressController {
    @Autowired
    private AddressRepository addressRepository;

    @PostMapping
    public Address saveAddress(@RequestBody Address address) {
        return addressRepository.save(address);
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @GetMapping(params = "userId")
    public List<Address> getAddressesByUserId(@RequestParam Long userId) {
        return addressRepository.findByUserId(userId);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAddressByUserId(@RequestParam Long userId) {
        if (addressRepository.existsByUserId(userId)) {
            addressRepository.deleteByUserId(userId);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}