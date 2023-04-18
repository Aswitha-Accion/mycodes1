package com.service;

import com.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired private ProductRepository productrepository;

    public ProductService(ProductRepository productRepository){

        this.productrepository = productRepository;
    }

    public List<Product> getAllProducts(int id){

        return productrepository.findAll();
    }
}
