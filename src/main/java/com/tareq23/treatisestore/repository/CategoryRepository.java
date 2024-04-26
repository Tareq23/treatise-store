package com.tareq23.treatisestore.repository;

import com.tareq23.treatisestore.entity.Category;
import com.tareq23.treatisestore.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
