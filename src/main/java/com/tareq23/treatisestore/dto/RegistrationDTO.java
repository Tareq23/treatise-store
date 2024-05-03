package com.tareq23.treatisestore.dto;

import com.tareq23.treatisestore.validation.UniqueEmail;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDTO {


    @NotBlank(message = "Name required")
    @Size(min = 3, max = 50, message = "User name should be greater than 3 and less than 50")
    private String name;

    @Email
    @UniqueEmail
    private String email;

    @NotNull(message = "Contact Number required!")
    @Size(min = 11, max = 14)
    private String mobileNumber;

    @NotNull(message = "Gender required")
    private String gender;

    @NotNull
    @Size(min = 6, max = 16)
    private String password;

}
