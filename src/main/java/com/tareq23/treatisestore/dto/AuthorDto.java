package com.tareq23.treatisestore.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {

    @NotNull
    private String name;

    @NotNull
    private String biography;
}
