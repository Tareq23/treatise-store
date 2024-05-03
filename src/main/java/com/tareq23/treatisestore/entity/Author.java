package com.tareq23.treatisestore.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "authors")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull(message = "Author name required!")
    @Size(min = 3, max = 50, message = "Author name should be less then 50 characters and greater than 3")
    private String name;

    @Column(columnDefinition = "text")
    private String image;

    @NotNull
    @Size(min = 10)
    private String inDetails;
}
