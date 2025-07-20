package com.example.AboutMe.model;

import com.example.AboutMe.model.UserEnum.UserGender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "surname")
    private String surname;

    @Column(unique = true, nullable = false, name = "email")
    private String email;

    @Column(name = "dateOfBirth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "gender")
    private UserGender gender;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "nationality")
    private String nationality;

    @Column(columnDefinition = "TEXT", name = "description")
    private String description;

    @Column(nullable = false, name = "hash_password")
    private String hashPassword;

    @Column(name = "website_url", length = 255)
    private String websiteUrl;
}
