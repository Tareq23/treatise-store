package com.tareq23.treatisestore.repository;

import com.tareq23.treatisestore.entity.Customer;
import com.tareq23.treatisestore.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
