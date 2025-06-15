package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String name;
    private String country;
    private String state;
    private String district;
    private String city;
    private String doorNo;
    private String street;
    private String landmark;
    private String mobile;
}