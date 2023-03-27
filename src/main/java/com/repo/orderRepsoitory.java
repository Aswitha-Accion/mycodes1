package com.repo;

import com.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepsoitory extends JpaRepository<Order, Integer> {
}
