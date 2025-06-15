package org.example.controller;

import org.example.RegistrationDetails;
import org.example.repository.RegistrationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {

    @Autowired
    private RegistrationDetailsRepository registrationDetailsRepository;

    @PostMapping
    public RegistrationDetails register(@RequestBody RegistrationDetails details) {
        return registrationDetailsRepository.save(details);
    }
}