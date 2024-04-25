package com.tareq23.treatisestore.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "books")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 100, min = 5)
    private String title;

    @NotNull
    @Size(min = 10)
    private Integer pages;

    @NotNull
    private Date publication_date;

    @Column(columnDefinition = "varchar(50)")
    private String isbn;

    @NotNull
    @Min(10)
    private Float price;


    @NotNull
    @Size(min = 10)
    @Column(columnDefinition = "text")
    private String summary;

    @Column(columnDefinition = "varchar(30) default 'bengali'")
    private String language;

    @Column(columnDefinition = "tinyint default 1")
    private Integer edition;

    @Column(columnDefinition = "boolean default true")
    private Boolean availability;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
