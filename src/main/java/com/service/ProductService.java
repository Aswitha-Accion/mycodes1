package com.service;

import com.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productrepository;

    public ProductService(ProductRepository productRepository){

        this.productrepository = productRepository;
    }

    public List<Product> getAllProducts(){

        return productrepository.findAll();
    }
}
