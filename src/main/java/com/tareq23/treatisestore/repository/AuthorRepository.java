package com.tareq23.treatisestore.repository;

import com.tareq23.treatisestore.entity.Author;
import com.tareq23.treatisestore.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
