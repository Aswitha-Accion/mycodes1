package com.service;

import com.entity.Order;
import com.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository {
    public List<Product> findAll();
    public Optional<Order> findById(int id);

}
