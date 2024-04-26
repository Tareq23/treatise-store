package com.tareq23.treatisestore.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDTO {


    @NotNull
    @Email
    private String username;

    @NotNull
    @Size(min = 6, max = 16)
    private String password;
}
