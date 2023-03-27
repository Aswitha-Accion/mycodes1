package com.service;

import com.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.util.Optional;

public class OrderService {

    @Autowired
    private ProductRepository productRepository;
    private OrderRepository orderRepository;
    private OrderService orderService;
    
    public OrderService(ProductRepository OrderService){

        this.productRepository = productRepository;
        this.orderService = orderService;
    }

    public Order getOrderDetails(int id){
        Optional<Order> order = productRepository.findById(id);
        return order.isPresent() ? order.get(): null;
    }

    public Order saveOrder(Order order) {
       return orderRepository.save(order);
    }




}

