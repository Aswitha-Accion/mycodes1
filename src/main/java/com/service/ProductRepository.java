package com.service;

import com.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository {
    Optional<Product> findById(int id);
}
