package com.service;

import com.entity.Product;

import java.util.List;

public class ProductService {

    private ProductRepository productrepository;

    public ProductService(ProductRepository productRepository){

        this.productrepository = productRepository;
    }

    public List<Product> getAllProducts(){

        return productrepository.findAll();
    }
}
