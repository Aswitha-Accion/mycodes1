package com.service;

import com.entity.Product;
import com.exceptions.ProductNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> productList() {


        List<Product> products = productRepository.findAll();
        return products;


    }

    public Product getProductById(Integer id) throws ProductNotExistException{
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent())
            throw new ProductNotExistException("product id is invalid" + id);
        return optionalProduct.get();
    }

    public List<Product> getAllProducts(Integer id) {
        return productList();
    }
}
