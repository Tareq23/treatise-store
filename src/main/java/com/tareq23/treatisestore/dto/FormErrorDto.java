package com.tareq23.treatisestore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormErrorDto {

    private boolean success;
    private String message;
    private Map<String, Object> fields;

}
