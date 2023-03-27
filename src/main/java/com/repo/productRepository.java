package com.repo;

import com.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Product, Integer> {
}
