package com.repo;

import com.entity.Order;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface orderRepsoitory extends JpaRepository<Order, Integer> {
}
