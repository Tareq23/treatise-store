package com.tareq23.treatisestore.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull
    @Size(max = 50, min = 3)
    private String name;


    @NotNull
    @Email
    @Size(max = 100)
    private String email;


    @NotNull
    @Size(max = 30, min=6)
    private String password;

    @NotNull
    @Size(max = 6, min = 4)
    private String gender;

    @NotNull
    @Size(max = 15, min = 11)
    private String mobileNumber;


    @Column(columnDefinition = "boolean default false")
    private Boolean isVerified;
}
