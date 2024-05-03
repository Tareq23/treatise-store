package com.tareq23.treatisestore.controller.api;


import com.tareq23.treatisestore.dto.AuthorDto;
import com.tareq23.treatisestore.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/add")
    public ResponseEntity<AuthorDto> addAuthor(@RequestBody AuthorDto author)
    {
        return ResponseEntity.ok(author);
    }

}
