package com.repo;

import com.entity.Order;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface orderRepsoitory extends JpaRepository<Order, Serializable> {

    public Order save(Order order);
}


