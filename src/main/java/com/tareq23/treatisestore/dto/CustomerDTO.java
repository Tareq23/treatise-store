package com.tareq23.treatisestore.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    @NotNull
    @Size(min = 3, max = 50, message = "User name should be greater than 3 and less than 50")
    private String name;

    @Email
    private String email;

    @NotNull
    @Size(min = 11, max = 14)
    private String mobileNumber;

    @NotNull
    private String gender;

}
