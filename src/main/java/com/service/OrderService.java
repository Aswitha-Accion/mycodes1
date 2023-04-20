package com.service;

import com.entity.Order;
import com.entity.Product;
import com.exceptions.OrderNotFoundException;
import com.repo.orderRepsoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private orderRepsoitory orderRepository;

    public List<Order> listOrders(User user) {

        return orderRepository.findAllByUserOrderByCreatedDateDesc(user);
    }


    public Order getOrder(Integer orderId) throws OrderNotFoundException {
        Optional<Order> order = orderRepository.findById(orderId);
        if (order.isPresent()) {
            return order.get();
        } else
        {
            throw new OrderNotFoundException("Order not found");
        }
    }



}





