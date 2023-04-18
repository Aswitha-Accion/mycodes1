package com.service;

import com.entity.Order;
import com.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired private OrderRepository orderRepository;
    @Autowired private OrderService orderService;

    
    public Product getOrderDetails(int id) {
        Optional<Product> order = productRepository.findById(id);
        return order.isPresent() ? order.get() : null;
    }

    public Order saveOrder(Order order) {

        return orderRepository.save(order);
    }
}

