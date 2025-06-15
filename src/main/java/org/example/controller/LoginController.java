package org.example.controller;

import org.example.model.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User found = userRepository.findByFullNameAndPassword(user.getFullName(), user.getPassword());
        if (found != null) {
            return "Login successful";
        } else {
            return "Invalid credentials";
        }
    }
}